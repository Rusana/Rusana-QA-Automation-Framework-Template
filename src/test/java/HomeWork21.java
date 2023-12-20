import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

public class HomeWork21 extends BaseTest {

    @Test
    public void renamePlaylist() {

        LoginPage loginPage = new LoginPage(driver);
        AllPlayListPAge allPlayListPAge = new AllPlayListPAge(driver);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayList();
        allPlayListPAge.clearTextPlaylist();
        allPlayListPAge.inputNewName();

        Assert.assertTrue(allPlayListPAge.isDisplayedNewName());

    }
}


