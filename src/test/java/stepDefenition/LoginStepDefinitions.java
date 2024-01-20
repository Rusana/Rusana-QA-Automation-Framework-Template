package stepDefenition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



    public class LoginStepDefinitions   {

        //    LoginPage loginPage = new LoginPage();
        public String url = "https://bbb.testpro.io/";
        WebDriver driver;
        WebDriverWait wait;

        public LoginStepDefinitions(WebDriver driver) {
//            super(driver);
            this.driver = driver;

        }


        @Before
        public void openBrowser()  {
//        setUpBrowser();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            options.addArguments("--remote-allow-origins=*");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.get(url);

        }


        @After
        public void exitBrowser() {
            driver.quit();

        }

        @When("I enter email {string}")
        public void iEnterEmail(String email) {
            WebElement logEmail = driver.findElement(By.xpath("//input[@type='email']"));
            logEmail.click();
            logEmail.clear();
            logEmail.sendKeys("shikhabidovarusana@gmail.com");

        }

        @And("I enter password {string}")
        public void iEnterPassword(String password) {
            WebElement logEmail = driver.findElement(By.cssSelector("[type='password']"));
            logEmail.click();
            logEmail.clear();
            logEmail.sendKeys("te$t$tudent");
        }

        @And("I submit")
        public void iSubmit() {
            WebElement btnLogIn = driver.findElement(By.cssSelector("[type='submit']"));
            btnLogIn.click();

        }

        @Then("I am logged in")
        public boolean iAmLoggedIn() {
            WebElement btnAvaIsDisplaied = driver.findElement(By.cssSelector("[class='avatar']"));
            return btnAvaIsDisplaied.isDisplayed();
        }
    }


