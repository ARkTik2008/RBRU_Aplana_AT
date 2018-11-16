package patternLesson.steps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import patternLesson.pages.DepositPage;

public class DepositSteps extends  BaseSteps{


    DepositPage depositPage = new DepositPage();


    public void fillField (String name, String value) throws Exception{
        WebElement element = depositPage.getField(name);
        depositPage.fillField(element,value);
    }

    public void click( String name) throws Exception {
        WebElement element = depositPage.getField(name);
        depositPage.click(element);
    }
    public void checkFile(String name, String value) throws Exception{

    WebElement element = depositPage.getField(name);
    Assert.assertEquals(value, element.getAttribute("value"));
    }

    public void checkFieldIsEnabled(String name) throws Exception{

    WebElement element = depositPage.getField(name);
    Boolean t = element.isEnabled();
    Assert.assertTrue(String.format("Поле (%s) недоступно", name), element.isEnabled());
    }



}
