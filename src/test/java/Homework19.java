import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() throws InterruptedException {
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        clickBtnPlayListTestPro() ;
        clickBtnDelPlayList();
        Assert.assertTrue(clickBtnAlertify());



        }

        private void clickBtnPlayListTestPro () throws InterruptedException {
            WebElement btnPlaylist = driver.findElement(By.xpath("//li[@class=\"playlist playlist\"]//a"));
            Thread.sleep(5000);
            btnPlaylist.click();


        }



    private void clickBtnDelPlayList() throws InterruptedException {
        WebElement  containPlayList=driver.findElement(By.cssSelector("[class='del btn-delete-playlist']"));
        Thread.sleep(500);
        containPlayList.click();
    }

    private boolean clickBtnAlertify() throws InterruptedException {
        WebElement btnAlertDel = driver.findElement(By.cssSelector("[class='success show']"));
        Thread.sleep(500);
        return btnAlertDel.isDisplayed();
    }





}
