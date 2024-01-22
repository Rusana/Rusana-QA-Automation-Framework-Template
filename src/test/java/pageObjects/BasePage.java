package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
     WebDriverWait wait;
     Actions actions;


    public BasePage(WebDriver driver) {



        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       actions = new Actions(driver);

    }
}


}

