import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class HomeWork16 extends BaseTest{
    @Test
    public void registrationTest(){


        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickBtnRegistration();
        String registUrl ="https://qa.koel.app/registration";


        Assert.assertEquals(driver.getCurrentUrl(), registUrl);

    }
}
