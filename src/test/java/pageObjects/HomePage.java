package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage {
    @FindBy(css = ".avatar")
    private WebElement userAvatarIcon;
    // This annotation is used to locate the user avatar icon on the home page using CSS selector.

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
        // The constructor calls the constructor of the base class (BasePage) using the given WebDriver.
    }

    public WebElement getUserAvatar() {
        return userAvatarIcon;
        // This method returns the userAvatarIcon WebElement, representing the user avatar element on the home page.
    }

    public void setUserAvatarIcon(WebElement userAvatarIcon) {
        this.userAvatarIcon = userAvatarIcon;
    }
}
