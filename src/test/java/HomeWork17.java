import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork17 extends BaseTest { // Объявление класса HomeWork17, который наследует функциональность класса BaseTest
    String expectedSongAddedMessage = "Added 1 song into";  // Ожидаемое сообщение об успешном добавлении песни в плейлист

    @Test // Обозначение метода как тестового метода с использованием аннотации @Test
    public void addSongToPlaylist() throws InterruptedException {
        // Поиск и взаимодействие с элементами веб-страницы
        enterEmail("shikhabidovarusana@gmail.com");
        enterPassword("te$t$tudent");
        clickSubmit(); // Поиск и клик по кнопке "Войти"
        clickButtonAllSong(); // Переход к разделу "Все песни"
        clickNameSong(); // Поиск и клик по имени песни (например, "Pluto")
        clickBtnAddSong();
        clickPlayList();// Поиск и клик по элементу "Плейлист"
        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage)); // Проверка фактичес (). contains(expectedSongAddedMessage));
    }
    public void clickPlayList() throws InterruptedException {
        Thread.sleep(500);
        WebElement playlist = driver.findElement(By.cssSelector("#songsWrapper .playlist"));
        playlist.click();

    }

    public void clickBtnAddSong() {
        WebElement buttonAddSong = driver.findElement(By.xpath("//button[@class='btn-add-to']"));
        buttonAddSong.click();
    }

    public void clickNameSong() throws InterruptedException {
        WebElement nameSong = driver.findElement(By.xpath("//section[@id='songsWrapper']//td[contains(text(),'Ketsa')]"));
        nameSong.click();
        Thread.sleep(500);
    }

    public void clickButtonAllSong() throws InterruptedException {
        WebElement buttonAllSong = driver.findElement(By.cssSelector("[class='songs']"));
        buttonAllSong.click();
        Thread.sleep(2000);

    }

    public String getNotificationText() { // Метод для получения текстового сообщения об успешном добавлении песни в плейлист
        WebElement notificationElement = driver.findElement(By.cssSelector("div.success.show"));
//        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage)); // Проверка фактичес (). contains(expectedSongAddedMessage));
        return notificationElement.getText();
    }

}