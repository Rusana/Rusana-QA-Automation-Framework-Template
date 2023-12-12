import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class HomeWork17 extends BaseTest { // Объявление класса HomeWork17, который наследует функциональность класса BaseTest
    String expectedSongAddedMessage = "Added 1 song into";  // Ожидаемое сообщение об успешном добавлении песни в плейлист

    @Test // Обозначение метода как тестового метода с использованием аннотации @Test
    public void addSongToPlaylist() throws InterruptedException {
        // Поиск и взаимодействие с элементами веб-страницы
        LoginPage loginPage= new LoginPage(driver);
        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        clickButtonAllSong(); // Переход к разделу "Все песни"
        clickNameSong(); // Поиск и клик по имени песни (например, "Pluto")
        clickbuttonAddSong();
        clickplaylist();// Поиск и клик по элементу "Плейлист"
        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage)); // Проверка фактичес (). contains(expectedSongAddedMessage));
    }

    public String getNotificationText() { // Метод для получения текстового сообщения об успешном добавлении песни в плейлист
        WebElement notificationElement = driver.findElement(By.cssSelector("div.success.show"));
//        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage)); // Проверка фактичес (). contains(expectedSongAddedMessage));
        return notificationElement.getText();
    }

}