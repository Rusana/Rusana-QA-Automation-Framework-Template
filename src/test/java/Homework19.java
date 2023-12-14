import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.LoginPage;

public class Homework19 extends BaseTest {

    @Test
    public void deletePlaylist() {
        AllPlayListPAge allPlayListPAge =new AllPlayListPAge(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allPlayListPAge.clickBtnPlayListTestPro() ;
        allPlayListPAge.clickBtnDelPlayList();
        Assert.assertTrue(clickBtnAlertify());

        }


    private boolean clickBtnAlertify()  {
        WebElement btnAlertDel = driver.findElement(By.cssSelector("[class='success show']"));
        return btnAlertDel.isDisplayed();
    }
}
