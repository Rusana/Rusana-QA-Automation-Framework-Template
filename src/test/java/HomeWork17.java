import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import  java.time.Duration ; //added
import java.util.UUID; //added

public class HomeWork17 extends BaseTest{
    @Test
    public void addSongToPlaylist () throws InterruptedException {
        WebElement logEmail= driver.findElement(By.xpath("//input[@type='email']"));
        logEmail.click();
        logEmail.clear();
        logEmail.sendKeys("shikhabidovarusana@gmail.com");
        WebElement logPassword= driver.findElement(By.cssSelector("[type='password']"));
        logPassword.click();
        logPassword.clear();
        logPassword.sendKeys("te$t$tudent");

        WebElement logIn=driver.findElement(By.cssSelector("[type='submit']"));
        logIn.click();

        WebElement allSong =driver.findElement(By.cssSelector("[class='songs']"));
        allSong.click();

        WebElement songAdd = driver.findElement(By.cssSelector("section#songResultsWrapper tr.song.item td.title"));
        songAdd.click();

        WebElement name= driver.findElement(By.cssSelector("[name='name']"));
        name.click();
        name.clear();
        name.sendKeys("Hi");
Thread.sleep(5000); //slow go for good to see your work in IJ
        String playListUrl="https://qa.koel.app/#!/home";

        Assert.assertEquals(driver.getCurrentUrl(),playListUrl);
//        driver.quit();

    }
}
