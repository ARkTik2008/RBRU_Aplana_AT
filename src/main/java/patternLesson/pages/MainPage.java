package patternLesson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePageObject {


    @FindBy(xpath = "//ul[@class = 'main-menu']//li")
    List<WebElement> mainMenu;

    public void selectMenuItem(String itemName){

    }

}
