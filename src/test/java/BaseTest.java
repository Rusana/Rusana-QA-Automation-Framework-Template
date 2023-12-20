import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver = null; // Объявление статической переменной driver, представляющей веб-драйвер
    public static WebDriverWait wait = null; //For explicit  wait;
    public static Actions actions = null;
//    public static String url = "https://qa.koel.app/"; //added



    @BeforeSuite// Метод, выполняющийся перед всеми тестами в наборе тестов
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();  // Настройка ChromeDriver с использованием WebDriverManager

    }

    @BeforeMethod  // Метод, выполняющийся перед каждым тестовым методом
//    @Parameters ({"BaseUrl"})   //parameterisation  started from TestNg.xml
    public static void setUpBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications", "--remote-allow-origins=*", "--incognito", "--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
// Установка опции исключения для обхода автоматизации
        driver = new ChromeDriver(options); // Инициализация веб-драйвера Chrome с заданными опциями
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Установка неявного ожидания (10 секунд)
        wait = new WebDriverWait(driver, Duration.ofSeconds(4)); // Method explicit wai
        String url = "https://qa.koel.app/"; // Задание URL-адреса, который будет открыт в браузере
        actions = new Actions(driver);
        driver.get(url); // Открытие указанной URL-страницы
//       driver.get("BaseUrl")  // Задание URL-адреса, который будет открыт в браузере used with @Parametr ...

    }


    @AfterMethod // Метод, выполняющийся после каждого тестового метода
    public static void tearDown() {
        driver.quit(); // Завершение сеанса браузера и освобождение ресурсов
    }



    protected void clickButtonAllSong() {
        WebElement buttonAllSong = driver.findElement(By.cssSelector("[class='songs']"));
        buttonAllSong.click();

    }


//
//    protected void clickSubmit() {
//        WebElement buttonLogIn = driver.findElement(By.cssSelector("[type='submit']"));
//        buttonLogIn.click();
//
//    }
//
//    protected void enterPassword(String password) {
//        WebElement logPassword = driver.findElement(By.cssSelector("[type='password']"));
//        logPassword.click();
//        logPassword.clear();
//        logPassword.sendKeys(password);
//
//    }
//
//    protected void enterEmail(String email) {
//        WebElement logEmail = driver.findElement(By.xpath("//input[@type='email']"));
//        logEmail.click();
//        logEmail.clear();
//        logEmail.sendKeys(email);
//
//    }
//

}





