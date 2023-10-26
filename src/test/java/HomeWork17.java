import org.openqa.selenium.By; // Импорт класса By для поиска элементов на веб-странице
import org.openqa.selenium.WebElement; // Импорт класса WebElement для представления элементов на веб-странице
import org.testng.Assert; // Импорт класса Assert для проверки утверждений в тестах
import org.testng.annotations.Test; // Импорт аннотации для обозначения тестового метода

public class HomeWork17 extends BaseTest { // Объявление класса HomeWork17, который наследует функциональность класса BaseTest
    String expectedSongAddedMessage = "Added 1 song into";

    @Test // Обозначение метода как тестового метода с использованием аннотации @Test
    public void addSongToPlaylist() throws InterruptedException {
        // Поиск и взаимодействие с элементами веб-страницы

        // Поиск элемента для ввода email
        WebElement logEmail = driver.findElement(By.xpath("//input[@type='email']"));
        logEmail.click();
        logEmail.clear();
        logEmail.sendKeys("shikhabidovarusana@gmail.com");

        // Поиск элемента для ввода пароля
        WebElement logPassword = driver.findElement(By.cssSelector("[type='password']"));
        logPassword.click();
        logPassword.clear();
        logPassword.sendKeys("te$t$tudent");

        // Поиск и клик по кнопке "Войти"
        WebElement buttonLogIn = driver.findElement(By.cssSelector("[type='submit']"));
        buttonLogIn.click();
        Thread.sleep(2000);

        // Переход к разделу "Все песни"
        WebElement buttonAllSong = driver.findElement(By.cssSelector("[class='songs']"));
        buttonAllSong.click();
        Thread.sleep(2000);

        // Поиск и клик по имени песни (например, "Pluto")
        WebElement nameSong = driver.findElement(By.xpath("//section[@id='songsWrapper']//td[contains(text(),'Pluto')]"));
        nameSong.click();
        Thread.sleep(500);

        // Поиск и клик по кнопке "Добавить песню в плейлист"
        WebElement buttonAddSong = driver.findElement(By.xpath("//button[@class='btn-add-to']"));
        buttonAddSong.click();
        Thread.sleep(500);

        // Поиск и клик по элементу "Плейлист"
        WebElement playlist = driver.findElement(By.cssSelector("#songsWrapper .playlist"));
        playlist.click();
        Thread.sleep(500);


//        String expectedSongAddedMessage = "Added 1 song into \"Test Pro PlayList.\""; // Ожидаемое сообщение об успешном добавлении песни в плейлист
//        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage));
//        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage));


        // Проверка фактичес (). contains(expectedSongAddedMessage));
    }

    // Метод для получения текстового сообщения об успешном добавлении песни в плейлист
    public String getNotificationText() {

        WebElement notificationElement = driver.findElement(By.cssSelector("div.success.show"));

        Assert.assertTrue(getNotificationText().contains(expectedSongAddedMessage));

        return notificationElement.getText();
    }

}