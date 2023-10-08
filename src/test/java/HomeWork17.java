import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork17 extends BaseTest{

    @Test

    public void addSongToPlaylist (){

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        String url= "https://qa.koel.app/";
        driver.get(url);

        WebElement logEmail= driver.findElement(By.cssSelector("[type='email']"));
        logEmail.click();
        logEmail.clear();
        logEmail.sendKeys("shikhabidovarusana@gmail.com");

        WebElement logPassword= driver.findElement(By.cssSelector("[type='password']"));
        logPassword.click();
        logPassword.clear();
        logPassword.sendKeys("te$t$tudent");
        WebElement logIn=driver.findElement(By.cssSelector("[type='submit']"));
        logIn.click();

//        String currentURL=


        Assert.assertEquals(driver.getCurrentUrl(),url);
        driver.quit();

    }
}
