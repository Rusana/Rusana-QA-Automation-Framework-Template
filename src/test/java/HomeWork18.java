import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongs;
import pageObjects.LoginPage;

public class HomeWork18 extends BaseTest {


    @Test
    public void playSong() {

        LoginPage loginPage = new LoginPage(driver);
        AllSongs allSongs = new AllSongs(driver);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allSongs.clickButtonControl();
        allSongs.clickBtnPlay();

        Assert.assertTrue(allSongs.displaytSoundBar());

    }


}





