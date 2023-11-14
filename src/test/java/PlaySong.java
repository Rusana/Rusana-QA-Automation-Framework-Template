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
//        clickBtnPause();
    }

    private void clickButtonControl() throws InterruptedException {
        WebElement btnControl = driver.findElement(By.cssSelector("[class='side player-controls']"));
        new Actions(driver)
                .moveToElement(btnControl)
                .perform();



    }
    protected void clickBtnPause() throws InterruptedException {
        WebElement btnPause = driver.findElement(By.cssSelector("[data-testid='pause-btn']"));

        Assert.assertTrue(btnPause.isDisplayed());
    }
}



