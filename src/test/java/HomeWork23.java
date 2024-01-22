import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ArtistsPage;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork23 extends BaseTest {
    @Test

    public void PageFactory() throws InterruptedException, MalformedURLException {

        LoginPage loginPage = new LoginPage(getThreadLocal());
        ArtistsPage artistsPage = new ArtistsPage(getThreadLocal());
        PageFactory.initElements(getThreadLocal(), this);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        Thread.sleep(500);

        Assert.assertTrue(artistsPage.artists());


    }
    
}
