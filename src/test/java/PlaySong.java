import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class PlaySong extends BaseTest {
    @Test
    public void playSong() throws InterruptedException {
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickButtonControl();
        clickBtnPlay();
        Assert.assertTrue(displaytSoundBar());
    }

    private void clickButtonControl() throws InterruptedException {
        WebElement btnControl = driver.findElement(By.cssSelector("[class='side player-controls']"));
        new Actions(driver)
                .moveToElement(btnControl)
                .perform();



    }
    private void clickBtnPlay() throws InterruptedException {

        WebElement btnPlay = driver.findElement(By.cssSelector("[data-testid='play-btn']"));
        Thread.sleep(500);
        btnPlay.click();

    }

    private boolean displaytSoundBar() throws InterruptedException {
        WebElement soundBar = driver.findElement(By.cssSelector("[alt='Sound bars']"));
Thread.sleep(500);
        return soundBar.isDisplayed();
    }
}



