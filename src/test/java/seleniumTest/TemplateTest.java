package seleniumTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TemplateTest extends BaseTest {

    @Test @Ignore @Ignore
    public void testMethod(){

        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");

        click(getDriver().findElement(By.xpath("//icon-close")));
        click(getDriver().findElement(By.xpath("//*[text() = 'Шаблоны и автоплатежи']")));
        click(getDriver().findElement(By.xpath("//*[text() = 'Оплатить']")));
        click(getDriver().findElement(By.xpath("//div[contains(@class, 'page-navigation-item')][text() = 'Мобильная связь']")));
        fillField(driver.findElement(By.xpath("//c-input-phone/input[contains(@class,'c-input-phone__input')]")),
                  "79101231233");
        elementClick(driver.findElement(By.xpath("//payment-form-card/div[contains(.,'Оплатить с карты')]/following-sibling::div//c-select")), "Дебетовка в рублях");
        fillField(driver.findElement(By.xpath("//c-input-currency//input")), "300");

        click(driver.findElement(By.xpath("//label[@class = 'c-checkbox__label']")));
        fillField(driver.findElement(By.xpath("//div[text() = 'Параметры шаблона']/following-sibling::div/div/input")), "teee");

        click(driver.findElement(By.xpath("//button[contains(@class,'rc-form__submit')][contains(.,'Сохранить шаблон')][2]")));

        Assert.assertEquals("Шаблон успешно сохранен", getText(driver.findElement(By.xpath("//notify//div[@class = 'notify__header']"))));

    }

    public void elementClick(WebElement element, String value) {

        element.click();
        click(element.findElement(By.xpath("//*[text() = '" + value + "']")));

    }

}
