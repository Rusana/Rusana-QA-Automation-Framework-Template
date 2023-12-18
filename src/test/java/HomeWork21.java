import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

public class HomeWork21 extends BaseTest {
//    String playListName = "pr";
    @Test
    public void renamePlaylist() throws InterruptedException {
        LoginPage loginPage= new LoginPage(driver);
        AllPlayListPAge allPlayListPAge =  new AllPlayListPAge(driver);
        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayList();
        allPlayListPAge.clearTextPlaylist();
        allPlayListPAge.inputNewName();
        Assert.assertTrue(allPlayListPAge.isDisplayedNewName());

        }
//
//    private void clickBtnPlayList()  {
//
//        WebElement btnPlayList= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href='#!/playlist/77061']")));
//        actions.doubleClick(btnPlayList).perform();
//
//    }
//    private void clearTextPlaylist()  {
//        WebElement fieldTextPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
//        fieldTextPlayList.sendKeys(Keys.chord(Keys.COMMAND,"A", Keys.BACK_SPACE));
//
//
//        }
//        private  void inputNewName(){
//        WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name']")));
//            newName.sendKeys(playListName);
//            newName.sendKeys(Keys.ENTER);
//
//        }
//        private boolean isDisplayedNewName() {
//      WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='success show']")));
//return newName.isDisplayed();
//
//    }
}


