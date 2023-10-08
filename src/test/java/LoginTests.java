import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
<<<<<<< Updated upstream

        Assert.assertEquals(driver.getCurrentUrl(),url );
=======
        WebElement emailLogin= driver.findElement(By.cssSelector("[type='email']"));
        emailLogin.click();
        emailLogin.clear();
        emailLogin.sendKeys();
        Assert.assertEquals(driver.getCurrentUrl(), url);
>>>>>>> Stashed changes
        driver.quit();
    }
}
