import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllButtonPLay;
import pageObjects.LoginPage;

import java.net.MalformedURLException;


public class Homework20 extends BaseTest{

    @Test
    public void displaitButtonTest () throws MalformedURLException {

        LoginPage loginPage = new LoginPage(threadDriver.get());
        AllButtonPLay allButtonPLay =new AllButtonPLay(threadDriver.get());


        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();

        Assert.assertTrue(allButtonPLay.displaitButton());
     }

    }
