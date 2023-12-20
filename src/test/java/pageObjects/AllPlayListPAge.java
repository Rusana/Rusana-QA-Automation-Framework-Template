package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AllPlayListPAge extends BasePage {

    By btnPLayListTestPro = By.xpath("//li[@class='playlist playlist']");

    By btnDeletePlaylist = By.cssSelector("[class='del btn-delete-playlist']");
    By windowAlertify = By.cssSelector("[class='success show']");
    By getPlayList = By.cssSelector("#songsWrapper .playlist");


    //HomeWork21

    String playListName = "pr";
    By buttonPlayList = By.xpath("//li[@class='playlist playlist']");
    By actClearPlayList = By.cssSelector("[name='name']");
    By actInputNewName = By.cssSelector("[name='name']");
    By fieldIsDisplayedNewName = By.cssSelector("[class='success show']");


    public AllPlayListPAge(WebDriver driver) {
        super(driver);

    }

    public void clickBtnPlayListTestPro() {
        WebElement btnPlaylist = wait.until(ExpectedConditions.elementToBeClickable(btnPLayListTestPro));
        btnPlaylist.click();

    }

    public void clickBtnDelPlayList() {
        WebElement containPlayList = wait.until(ExpectedConditions.elementToBeClickable(btnDeletePlaylist));
        containPlayList.click();
    }

    public boolean isDispalayAlertify() {
        WebElement btnAlertDel = wait.until(ExpectedConditions.visibilityOfElementLocated(windowAlertify));
        return btnAlertDel.isDisplayed();
    }

    public void clickPlayList() {
        WebElement playlist = wait.until(ExpectedConditions.elementToBeClickable(getPlayList));
        playlist.click();

    }


    //HomeWork21

    public void clickBtnPlayList() {

        WebElement btnPlayList = wait.until(ExpectedConditions.elementToBeClickable(buttonPlayList));

        actions.doubleClick(btnPlayList).perform();

    }

    public void clearTextPlaylist() {
        WebElement fieldTextPlayList = wait.until(ExpectedConditions.elementToBeClickable(actClearPlayList));
        fieldTextPlayList.sendKeys(Keys.chord(Keys.COMMAND, "A", Keys.BACK_SPACE));

    }

    public void inputNewName() {
        WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(actInputNewName));
        newName.sendKeys(playListName);
        newName.sendKeys(Keys.ENTER);
    }

    public boolean isDisplayedNewName() {
        WebElement newName = wait.until(ExpectedConditions.visibilityOfElementLocated(fieldIsDisplayedNewName));
        return newName.isDisplayed();

    }
}

