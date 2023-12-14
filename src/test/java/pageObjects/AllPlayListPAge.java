package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllPlayListPAge extends BasePage {

    By btnPLayListTestPro = By.xpath("//li[@class='playlist playlist']//a");
    By btnDeletePlaylist = By.cssSelector("[class='del btn-delete-playlist']");

    public AllPlayListPAge(WebDriver driver) {
        super(driver);

    }
    public void clickBtnPlayListTestPro() {
        WebElement btnPlaylist = driver.findElement(btnPLayListTestPro);
        btnPlaylist.click();

    }
    public void clickBtnDelPlayList() {
        WebElement containPlayList = driver.findElement(btnDeletePlaylist);
        containPlayList.click();
    }

}

