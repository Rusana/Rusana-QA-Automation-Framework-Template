import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.AllSongs;
import pageObjects.LoginPage;

public class HomeWork18 extends BaseTest {


    @Test
    public void playSong()  {
        LoginPage loginPage = new LoginPage(driver);
        AllPlayListPAge allPlayListPAge =new AllPlayListPAge(driver);
        AllSongs allSongs =new AllSongs(driver);
        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        clickButtonControl();
        clickBtnPlay();
       Assert.assertTrue(displaytSoundBar());

    }

    private boolean clickButtonControl() {
        WebElement btnControl = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='side player-controls']")));
        new Actions(driver)
                .moveToElement(btnControl)
                .perform();
        return btnControl.isDisplayed();
    }

       private void clickBtnPlay () {

            WebElement btnPlay = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-testid='play-btn']")));
            btnPlay.click();

        }

        private boolean displaytSoundBar () {
            WebElement soundBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[alt='Sound bars']")));
            return soundBar.isDisplayed();
        }
    }





