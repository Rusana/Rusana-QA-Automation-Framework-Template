import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        AllPlayListPAge allPlayListPAge = new AllPlayListPAge(getThreadLocal());

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayListTestPro() ;
        allPlayListPAge.clickBtnDelPlayList();

        Assert.assertTrue(allPlayListPAge.isDispalayAlertify());

        }
}
