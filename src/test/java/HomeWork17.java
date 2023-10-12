import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import  java.time.Duration ;




public class HomeWork17 extends BaseTest{
    @Test


    public void addSongToPlaylist (){
//        setupEmail("shikhabidovarusana@gmail.com");

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url= "https://qa.koel.app/";
        driver.get(url);

        WebElement logEmail= driver.findElement(By.xpath("//input[@type='email']"));
        logEmail.click();
        logEmail.clear();
        logEmail.sendKeys("shikhabidovarusana@gmail.com");
//?        logEmail.sendKeys("email");
        WebElement logPassword= driver.findElement(By.cssSelector("[type='password']"));
        logPassword.click();
        logPassword.clear();
        logPassword.sendKeys("te$t$tudent");

        WebElement logIn=driver.findElement(By.cssSelector("[type='submit']"));
        logIn.click();

        WebElement playListLink =driver.findElement(By.cssSelector("[class='fa fa-plus-circle create']"));
        playListLink.click();

        WebElement newPlaylist = driver.findElement(By.xpath("//li[.='New Playlist']"));
        newPlaylist.click();

        WebElement name= driver.findElement(By.cssSelector("[name='name']"));
        name.click();
        name.clear();
        name.sendKeys("Algorithms");

        String playListUrl="https://qa.koel.app/#!/home";

        Assert.assertEquals(driver.getCurrentUrl(),playListUrl);
        driver.quit();

//
//    }
//
//    private void setupEmail() {


    }
}
