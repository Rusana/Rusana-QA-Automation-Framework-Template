import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class HomeWork21 extends BaseTest {
    @Test
    public void renamePlaylist() throws InterruptedException {
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickBtnPlayList();
//        clickNameSong();
//        clickBtnPro();


    }

    private void clickBtnPlayList() throws InterruptedException {
        Thread.sleep(1000);


        WebElement btnPlayList= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='active']")));

        Actions actions = new Actions(driver);
        actions.doubleClick(btnPlayList).perform();

    }
}


