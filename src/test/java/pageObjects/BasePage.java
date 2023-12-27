package pageObjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    WebDriver driver;
     WebDriverWait wait;
     Actions actions;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        driver = pickBrowser(System.getProperty("browser"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);


    }
    public WebDriver pickBrowser ( String browser){

        switch (browser){

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
               return driver = new FirefoxDriver();

            case "safari":
                WebDriverManager.safaridriver().setup();
                return  driver = new SafariDriver();

            default:
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-notifications", "--remote-allow-origins=*", "--incognito", "--start-maximized");
//                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                options.addArguments("--remote-allow-origins=*");
                return driver =  new ChromeDriver(options);
        }
    }

}
