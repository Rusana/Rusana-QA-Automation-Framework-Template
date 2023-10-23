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

        WebElement buttonLogIn=driver.findElement(By.cssSelector("[type='submit']"));
        buttonLogIn.click();

        WebElement buttonAllSong =driver.findElement(By.cssSelector("[class='songs']"));
        buttonAllSong.click();
        Thread.sleep(2000);

        WebElement nameSong= driver.findElement(By.xpath("//tr[@class='song-item playing selected']//td[@class='title']"));
        nameSong.click();

        WebElement choseSong = driver.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item']"));
        choseSong.click();

        WebElement buttonAddSong= driver.findElement(By.xpath("//button[@class='btn-add-to']"));
        buttonAddSong.click();
//
        WebElement newPlayList= driver.findElement(By.cssSelector(""));
        newPlayList.clear();
        newPlayList.sendKeys("Hi");
Thread.sleep(5000); //slow go for good to see your work in IJ
        String playListUrl="https://qa.koel.app/#!/home";

        Assert.assertEquals(driver.getCurrentUrl(),playListUrl);
//        driver.quit();

    }
}
