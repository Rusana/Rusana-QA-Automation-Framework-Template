import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork21 extends BaseTest {

    @Test
    public void renamePlaylist() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(threadDriver.get());
        AllPlayListPAge allPlayListPAge = new AllPlayListPAge(threadDriver.get());

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayList();
        allPlayListPAge.clearTextPlaylist();
        allPlayListPAge.inputNewName();

        Assert.assertTrue(allPlayListPAge.isDisplayedNewName());

    }
}


