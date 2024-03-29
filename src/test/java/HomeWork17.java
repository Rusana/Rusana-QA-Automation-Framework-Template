import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AllPlayListPAge;
import pageObjects.AllSongs;
import pageObjects.LoginPage;

import java.net.MalformedURLException;

public class HomeWork17 extends BaseTest { // Объявление класса HomeWork17, который наследует функциональность класса BaseTest
    String expectedSongAddedMessage = "Added 1 song into";  // Ожидаемое сообщение об успешном добавлении песни в плейлист

    @Test // Обозначение метода как тестового метода с использованием аннотации @Test
    public void addSongToPlaylist() throws MalformedURLException {
        // Поиск и взаимодействие с элементами веб-страницы
        LoginPage loginPage = new LoginPage(getThreadLocal());
        AllSongs allSongs = new AllSongs(getThreadLocal());
        AllPlayListPAge allPlayListPAge = new AllPlayListPAge(getThreadLocal());

        loginPage.enterEmail("shikhabidovarusana@gmail.com");
        loginPage.enterPassword("te$t$tudent");
        loginPage.clickSubmit();
        allSongs.clickButtonAllSong(); // Переход к разделу "Все песни"
        allSongs.clickNameSong(); // Поиск и клик по имени песни (например, "Pluto")
        allSongs.clickBtnAddSong();
        allPlayListPAge.clickPlayList();// Поиск и клик по элементу "Плейлист"

        Assert.assertTrue(allSongs.getNotificationText().contains(expectedSongAddedMessage)); // Проверка фактичес (). contains(expectedSongAddedMessage));



    }

}