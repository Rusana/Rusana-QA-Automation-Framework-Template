import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllButtonPLay;
import pageObjects.LoginPage;

import java.net.MalformedURLException;


public class Homework20 extends BaseTest{

    @Test
    public void displaitButtonTest () throws MalformedURLException {

        LoginPage loginPage = new LoginPage(driver);
        AllButtonPLay allButtonPLay =new AllButtonPLay(driver);


        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();

        Assert.assertTrue(allButtonPLay.displaitButton());
     }

    }
