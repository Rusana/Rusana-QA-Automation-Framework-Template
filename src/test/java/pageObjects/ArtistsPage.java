package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ArtistsPage extends BasePage{

    @FindBy(xpath = "//a[@href='#!/artists'] ")

   public WebElement artistsObject;

    public ArtistsPage(WebDriver driver) {

        super(driver);
    }

    public boolean artists (){
      return   artistsObject.isDisplayed();


    }
}
