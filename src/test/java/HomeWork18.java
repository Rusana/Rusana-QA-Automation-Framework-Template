import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllSongs;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork18 extends BaseTest {


    @Test
    public void playSong() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(threadDriver.get());
        AllSongs allSongs = new AllSongs(threadDriver.get());

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allSongs.clickButtonControl();
        allSongs.clickBtnPlay();

        Assert.assertTrue(allSongs.displaytSoundBar());

    }


}





