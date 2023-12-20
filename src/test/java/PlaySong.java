import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class PlaySong extends BaseTest {
    @Test
    public void playSong() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        clickButtonControl();
        clickBtnPlay();
        Assert.assertTrue(displaytSoundBar());
    }

    public void clickButtonControl() {
        WebElement btnControl = driver.findElement(By.cssSelector("[class='side player-controls']"));
        new Actions(driver)
                .moveToElement(btnControl)
                .perform();

    }

    public void clickBtnPlay() {

        WebElement btnPlay = driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        btnPlay.click();

    }

    public boolean displaytSoundBar() {
        WebElement soundBar = driver.findElement(By.cssSelector("[alt='Sound bars']"));
        return soundBar.isDisplayed();
    }
}



