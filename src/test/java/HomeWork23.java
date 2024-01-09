import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ArtistsPage;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork23 extends BaseTest {
    @Test

    public void PageFactory() throws InterruptedException, MalformedURLException {

        LoginPage loginPage = new LoginPage(threadDriver.get());
        ArtistsPage artistsPage = new ArtistsPage(threadDriver.get());
        PageFactory.initElements(threadDriver.get(), this);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        Thread.sleep(500);

        Assert.assertTrue(artistsPage.artists());


    }
    
}
