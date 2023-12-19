package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllSongs extends BasePage {

    By btnAddSong = By.xpath("//button[@class='btn-add-to']");
    By btnNameSong = By.xpath("//section[@id='songsWrapper']//td[contains(text(),'Frantic')]");
    By getBtnAllSong = By.cssSelector("[class='songs']");
    By windowNotificationText = By.cssSelector("div.success.show");


    //Homework18

    By clickBtnnControl = By.cssSelector("[class='side player-controls']");
    By clickButtonPLay = By.cssSelector("[data-testid='play-btn']");
    By windowDisplaySoundBar = By.cssSelector("[alt='Sound bars']");


    public AllSongs(WebDriver driver) {
        super(driver);

    }

    public void clickBtnAddSong() {
        WebElement buttonAddSong = wait.until(ExpectedConditions.elementToBeClickable(btnAddSong));
        buttonAddSong.click();
    }

    public void clickNameSong() {
        WebElement nameSong = wait.until(ExpectedConditions.elementToBeClickable(btnNameSong));
        nameSong.click();
    }

    public void clickButtonAllSong() {
        WebElement buttonAllSong = wait.until(ExpectedConditions.elementToBeClickable(getBtnAllSong));
        buttonAllSong.click();

    }

    public String getNotificationText() { // Метод для получения текстового сообщения об успешном добавлении песни в плейлист
        WebElement notificationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(windowNotificationText));
        return notificationElement.getText();
    }

    //Homework18


    public boolean clickButtonControl() {
        WebElement btnControl = wait.until(ExpectedConditions.visibilityOfElementLocated(clickBtnnControl));
        new Actions(driver)
                .moveToElement(btnControl)
                .perform();
        return btnControl.isDisplayed();
    }

    public void clickBtnPlay() {
        WebElement btnPlay = wait.until(ExpectedConditions.elementToBeClickable(clickButtonPLay));
        btnPlay.click();

    }

    public boolean displaytSoundBar() {
        WebElement soundBar = wait.until(ExpectedConditions.visibilityOfElementLocated(windowDisplaySoundBar));
        return soundBar.isDisplayed();
    }

}
