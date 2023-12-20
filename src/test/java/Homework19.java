import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() {

        LoginPage loginPage = new LoginPage(driver);
        AllPlayListPAge allPlayListPAge = new AllPlayListPAge(driver);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayListTestPro() ;
        allPlayListPAge.clickBtnDelPlayList();

        Assert.assertTrue(allPlayListPAge.isDispalayAlertify());

        }
}
