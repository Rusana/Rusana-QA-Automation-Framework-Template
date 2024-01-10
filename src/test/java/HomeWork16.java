import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork16 extends BaseTest{

    @Test
    public void registrationTest() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        loginPage.clickBtnRegistration();

        String registUrl ="https://qa.koel.app/registration";
        Assert.assertEquals( getThreadLocal().getCurrentUrl(), registUrl);


    }
}
