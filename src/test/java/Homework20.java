import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class Homework20 extends BaseTest{

    @Test
    public void displaitButtonTest () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        Assert.assertTrue(displaitButton() );

    }
private  boolean displaitButton (){
    WebElement btnHome = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='home active']")));
     return   btnHome.isDisplayed();

}

}
