package patternLesson.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import patternLesson.util.DriverManager;

import java.util.List;

public class BasePageObject {


    WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 60);

    public BasePageObject()
    {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void selectMebuItem(List<WebElement> items, String itemName){

        for (WebElement item : items){
            if (item.getText().equalsIgnoreCase(itemName)){
                item.click();
                return;
            }
            Assert.fail("Не найден пункт меню " + itemName);
        }

    }


}
