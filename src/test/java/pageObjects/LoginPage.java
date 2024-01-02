package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;

public class LoginPage extends BasePage {
    By registration = By.cssSelector("[href='registration']");
    By btnLogin = By.cssSelector("[type='submit']");
    By fieldPassword = By.cssSelector("[type='password']");
    By fieldEmail = By.xpath("//input[@type='email']");

    public LoginPage(WebDriver driver) throws MalformedURLException {

        super(driver);
    }

    public void clickBtnRegistration() {
        WebElement btnRegistration = driver.findElement(registration);
        btnRegistration.click();

    }

    public void clickSubmit() {
        WebElement btnLogIn = driver.findElement(btnLogin);
        btnLogIn.click();

    }

    public void enterPassword(String password) {
        WebElement btnPassword = driver.findElement(fieldPassword);
        btnPassword.click();
        btnPassword.clear();
        btnPassword.sendKeys(password);

    }

    public void enterEmail(String email) {
        WebElement logEmail = driver.findElement(fieldEmail);
        logEmail.click();
        logEmail.clear();
        logEmail.sendKeys(email);

    }


}
