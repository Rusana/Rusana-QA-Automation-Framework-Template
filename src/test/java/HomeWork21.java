import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork21 extends BaseTest {
    String playListName = "pr";
    @Test
    public void renamePlaylist()  {
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickBtnPlayList();
        clearTextPlaylist();
        inputNewName();
        Assert.assertTrue(isDisplayedNewName());




        }

    private void clickBtnPlayList()  {

        WebElement btnPlayList= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='#!/playlist/77061']")));
        actions.doubleClick(btnPlayList).perform();

    }
    private void clearTextPlaylist()  {
        WebElement fieldTextPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
        fieldTextPlayList.sendKeys(Keys.chord(Keys.COMMAND,"A", Keys.BACK_SPACE));


        }
        private  void inputNewName(){
        WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
            newName.sendKeys(playListName);
            newName.sendKeys(Keys.ENTER);

        }
        private boolean isDisplayedNewName() {
      WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='success show']")));
return newName.isDisplayed();

    }
}


