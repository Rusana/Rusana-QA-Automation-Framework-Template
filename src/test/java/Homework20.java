import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.Instant;

public class Homework20 extends BaseTest{

    @Test
    public void displaitButtonTest () throws InterruptedException {
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit();
        Assert.assertFalse(displaitButton() );

    }
private  boolean displaitButton (){
    WebElement btnHome = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='home active']")));
     return   btnHome.isDisplayed();

}

}
