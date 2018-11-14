package patternLesson.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePageObject {

    @FindBy(xpath = "//ul[@class='main-menu']//li")
    public List<WebElement> mainMenu;



    @FindBy(xpath = "//a[contains(@class,'menu-section-link')][@href]")
    public List<WebElement> subMenu;

    @FindBy(xpath = "//*[text()='Да']")
    public WebElement acceptRegion;


    public void selectMenuItem(String itemName){
        selectMenuItem(mainMenu, itemName);
    }

    public void selectSubMenuItem(String itemName){
        selectMenuItem(subMenu, itemName);
    }

    public void acceptRegion() {
        click(acceptRegion);
    }


}
