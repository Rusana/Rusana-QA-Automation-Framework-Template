package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HomePage extends BasePage {
    By IconAvatar = By.cssSelector("[class='avatar']");

//    @FindBy(css = "[class='avatar']")
//  public WebElement userAvatarIcon;
//    // This annotation is used to locate the user avatar icon on the home page using CSS selector.

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
        // The constructor calls the constructor of the base class (BasePage) using the given WebDriver.
    }
    public boolean getUserAvatar() {
        WebElement userAvatarIcon = wait.until(ExpectedConditions.presenceOfElementLocated(IconAvatar));
        return userAvatarIcon.isDisplayed() ;
        // This method returns the userAvatarIcon WebElement, representing the user avatar element on the home page.
    }

    }

