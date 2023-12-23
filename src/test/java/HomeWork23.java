import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ArtistsPage;
import pageObjects.LoginPage;

public class HomeWork23 extends BaseTest {
    @Test

    public void PageFactory() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        ArtistsPage artistsPage = new ArtistsPage(driver);
        PageFactory.initElements(driver, this);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        Thread.sleep(500);

        Assert.assertTrue(artistsPage.artists());


    }
    
}
