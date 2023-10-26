import io.github.bonigarcia.wdm.WebDriverManager; // Импорт библиотеки для управления веб-драйвером
import org.openqa.selenium.WebDriver; // Импорт интерфейса WebDriver для взаимодействия с браузером
import org.openqa.selenium.chrome.ChromeDriver;  // Импорт класса ChromeDriver для управления браузером Google Chrome
import org.openqa.selenium.chrome.ChromeOptions; // Импорт класса ChromeOptions для настройки параметров Chrome
import org.testng.annotations.AfterMethod; // Импорт аннотации для завершения метода после каждого тестового метода
import org.testng.annotations.BeforeMethod;  // Импорт аннотации для выполнения метода перед каждым тестовым методом
import org.testng.annotations.BeforeSuite; // Импорт аннотации для выполнения метода перед всеми тестами в наборе тестов
import java.time.Duration; // Импорт класса Duration для работы с временем

public class BaseTest {
    public static WebDriver driver = null; // Объявление статической переменной driver, представляющей веб-драйвер

//    public static String url = "https://qa.koel.app/"; //added

    @BeforeSuite // Метод, выполняющийся перед всеми тестами в наборе тестов
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();  // Настройка ChromeDriver с использованием WebDriverManager
    }
    @BeforeMethod  // Метод, выполняющийся перед каждым тестовым методом
    public static void setUpBrowser() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications","--remote-allow-origins=*", "--incognito","--start-maximized");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
// Установка опции исключения для обхода автоматизации
        driver = new ChromeDriver(options); // Инициализация веб-драйвера Chrome с заданными опциями
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Установка неявного ожидания (10 секунд)
        String url = "https://qa.koel.app/"; // Задание URL-адреса, который будет открыт в браузере
        driver.get(url); // Открытие указанной URL-страницы
    }
    @AfterMethod // Метод, выполняющийся после каждого тестового метода
public static void  tearDown () {
        driver.quit(); // Завершение сеанса браузера и освобождение ресурсов
    }

    }



