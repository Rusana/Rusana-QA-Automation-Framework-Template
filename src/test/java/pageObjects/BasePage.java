package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePage {

    WebDriver driver;
     WebDriverWait wait;
     Actions actions;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    }
//    public WebDriver pickBrowser ( String browser) throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        String gridURL = "http://192.168.0.161:4444";
//        switch (browser){
//
//            case "firefox":
//                WebDriverManager.firefoxdriver().setup();
//               return driver = new FirefoxDriver();
//
//            case "safari":
//                WebDriverManager.safaridriver().setup();
//                return  driver = new SafariDriver();
//            case "grid-firefox":
//                capabilities.setCapability("browserName" ,"firefox");
//                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),capabilities);
//            case "grid-safari":
//                capabilities.setCapability("browserName" ,"safari");
//                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),capabilities);
//            case "grid-chrome":
//                capabilities.setCapability("browserName" ,"chrome");
//                return driver = new RemoteWebDriver(URI.create(gridURL).toURL(),capabilities);
//
//
//
//            default:
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--disable-notifications", "--remote-allow-origins=*", "--incognito", "--start-maximized");
////                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//                options.addArguments("--remote-allow-origins=*");
//                return driver =  new ChromeDriver(options);
//        }





