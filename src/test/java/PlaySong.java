import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class PlaySong extends BaseTest {
    @Test
    public void playSong() throws MalformedURLException {

        LoginPage loginPage = new LoginPage(threadDriver.get());

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        clickButtonControl();
        clickBtnPlay();
        Assert.assertTrue(displaytSoundBar());
    }

    public void clickButtonControl() {
        WebElement btnControl = threadDriver.get().findElement(By.cssSelector("[class='side player-controls']"));
        new Actions(threadDriver.get())
                .moveToElement(btnControl)
                .perform();

    }

    public void clickBtnPlay() {

        WebElement btnPlay = threadDriver.get().findElement(By.cssSelector("[data-testid='play-btn']"));
        btnPlay.click();

    }

    public boolean displaytSoundBar() {
        WebElement soundBar = threadDriver.get().findElement(By.cssSelector("[alt='Sound bars']"));
        return soundBar.isDisplayed();
    }
}



