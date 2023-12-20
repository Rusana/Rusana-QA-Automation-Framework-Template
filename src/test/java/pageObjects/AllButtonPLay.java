package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllButtonPLay extends BasePage {

    //HomeWork18
    By notificationDisplaytBtn = By.cssSelector("[class='home active']");

    //HomeWork18

    public AllButtonPLay(WebDriver driver) {
        super(driver);

    }

    public boolean displaitButton() {
        WebElement btnHome = wait.until(ExpectedConditions.presenceOfElementLocated(notificationDisplaytBtn));
        return btnHome.isDisplayed();

    }
}
