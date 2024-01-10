import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class BaseTest {

    private static final ThreadLocal<WebDriver> THREAD_LOCAL = new ThreadLocal<>();
    private WebDriver driver;

    public static WebDriver getThreadLocal() {
        return THREAD_LOCAL.get();
    }

    @BeforeMethod
    @Parameters({"BaseURL"})
    public void setUpBrowser(@Optional String baseURL) throws MalformedURLException {
        THREAD_LOCAL.set(pickBrowser(System.getProperty("browser")));
        THREAD_LOCAL.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        THREAD_LOCAL.get().manage().window().maximize();
        THREAD_LOCAL.get().manage().deleteAllCookies();
        getThreadLocal().get(baseURL);
        System.out.println(
                "Browser setup by Thread " + Thread.currentThread().getId() + " and Driver reference is : " + getThreadLocal());

    }


    public WebDriver lambdaTest() throws MalformedURLException {
        String username = "shikhabidovarusana";
        String authkey = "qO0H5R2YUaxl4t5J0UrLpkk4cnNfHeKZNyZI4IHMZb7z6JzDkK";
        String hub = "@hub.lambdatest.com/wd/hub";
    FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setCapability("platform", "Windows 10");
        browserOptions.setCapability("browserName", "Chrome");
        browserOptions.setCapability("version", "122.0");
        browserOptions.setCapability("resolution", "1024x768");
        browserOptions.setCapability("build", "Koel Automatioon");
        browserOptions.setCapability("name", this.getClass().getName());
        browserOptions.setCapability("plugin", "java-testNG");
        return new RemoteWebDriver(new URL("https://" + username + ":" + authkey + hub), browserOptions);

}


    public WebDriver pickBrowser(String browser) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities(); // Create a new DesiredCapabilities object
        String gridURL = "http://192.168.0.161:4444"; // Set the URL for the Selenium Grid

        switch (browser) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // Set up the FirefoxDriver executable using WebDriverManager
                FirefoxOptions firefoxOptions = new FirefoxOptions(); // Create a new FirefoxOptions object
                firefoxOptions.addPreference("dom.webnotifications.enabled", false); // Disable web notifications
                return new FirefoxDriver(firefoxOptions.merge(caps)); // Launch Firefox with the specified options and capabilities

            case "MicrosoftEdge":
                WebDriverManager.edgedriver().setup(); // Set up the EdgeDriver executable using WebDriverManager
                EdgeOptions edgeOptions = new EdgeOptions(); // Create a new EdgeOptions object
                edgeOptions.addArguments("--remote-allow-origins=*"); // Allow remote origins
                return new EdgeDriver(edgeOptions.merge(caps)); // Launch Edge with the specified options and capabilities

            case "grid-edge":
                caps.setCapability("browserName", "MicrosoftEdge"); // Set the browser capability to Microsoft Edge
                return new RemoteWebDriver(URI.create(gridURL).toURL(), caps); // Launch a remote WebDriver instance with the specified capabilities

            case "grid-firefox":
                caps.setCapability("browserName", "firefox"); // Set the browser capability to Firefox
                return new RemoteWebDriver(URI.create(gridURL).toURL(), caps); // Launch a remote WebDriver instance with the specified capabilities

            case "grid-chrome":
                caps.setCapability("browserName", "chrome"); // Set the browser capability to Chrome
                return new RemoteWebDriver(URI.create(gridURL).toURL(), caps); // Launch a remote WebDriver instance with the specified capabilities
            case  "cloud":
                return lambdaTest(); 
            default:
                WebDriverManager.chromedriver().setup(); // Set up the ChromeDriver executable using WebDriverManager
                ChromeOptions options = new ChromeOptions(); // Create a new ChromeOptions object
                options.addArguments("--disable-notifications", "--remote-allow-origins=*", "--incognito", "--start-maximized"); // Disable notifications, allow remote origins, launch in incognito mode, and start maximized
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); // Exclude the enable-automation switch
                return new ChromeDriver(options.merge(caps)); // Launch Chrome with the specified options and capabilities
        }
    }
    @AfterMethod
    public void tearDown() {
        THREAD_LOCAL.get().close();
        THREAD_LOCAL.remove();
    }
}







