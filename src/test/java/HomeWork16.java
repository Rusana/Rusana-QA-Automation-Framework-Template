import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork16 extends BaseTest{

    @Test
    public void registrationTest() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());
        loginPage.isDisplayedBtnRegistration();

        String registUrl ="https://qa.koel.app/registration";
        Assert.assertEquals( getThreadLocal().getCurrentUrl(), registUrl);


    }
}
