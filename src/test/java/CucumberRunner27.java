import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

//public class CucumberRunner27 extends LoginStepDefinitions {
//
//
//    public CucumberRunner27(WebDriver driver) {
//        super(driver);
//    }

    @CucumberOptions(
                plugin = {"pretty", "json:src/test/resources/features/reports/test.json"},
                features = {"src/test/resources/features/"},
                glue = {"stepDefinition"}
        )
        public class CucumberRunner27 extends AbstractTestNGCucumberTests {


            private TestNGCucumberRunner testNGCucumberRunner;


            @BeforeClass(alwaysRun = true)
            public void setUpCucumber() {
                testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
            }


            @DataProvider
            public Object[][] features() {
                return testNGCucumberRunner.provideScenarios();
            }


            @AfterClass(alwaysRun = true)
            public void tearDownClass() {
                testNGCucumberRunner.finish();
            }
        }

