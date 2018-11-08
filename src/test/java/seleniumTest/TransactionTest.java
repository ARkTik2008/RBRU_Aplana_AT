package seleniumTest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionTest extends BaseTest {

    @Test
    public void testMethod() {
        WebDriver driver = getDriver();
        driver.get("https://online.raiffeisen.ru/demo/");

        click(getDriver().findElement(By.xpath("//icon-close")));

        click(getDriver().findElement(By.xpath("//*[text() = 'Перевести']")));
        click(getDriver().findElement(By.xpath("//*[text() = 'Клиенту банка']")));
        elementClick(getDriver().findElement(By.xpath("//c-select")), "Мой счет в рублях");
        click(driver.findElement(By.xpath("//*[text() = 'По номеру телефона']")));
        fillField(driver.findElement(By.xpath("//c-input-phone/input[contains(@class,'c-input-phone__input')]")),
                  "79101231233");
        Assert.assertEquals("Сидоров П.И.", getText(driver.findElement(
                By.xpath("//label[text()='ФИО получателя']/../following-sibling::div//div"))));
        //Assert.assertEquals("Сидоров П.И.", wait.until(driver.findElement(By.xpath("//label[text()='ФИО получателя']/../following-sibling::div//div"))).getText());


        fillField(driver.findElement(By.xpath("//ruble-transfer-form-amount//input")), "0");
        Assert.assertEquals("Сумма перевода должна быть больше 0",
                            getText(driver.findElement(By.xpath("//span[@class = 'simple-error']"))));
        //Assert.assertEquals("Сумма перевода должна быть больше 0", driver.findElement(By.xpath("//span[@class = 'simple-error']")).getText());

        fillField(driver.findElement(By.xpath("//ruble-transfer-form-amount//input")), "2000000");
        Assert.assertEquals("Введенная сумма превышает максимально допустимую (1 000 000,00 \u20BD)",
                            getText(driver.findElement(By.xpath("//span[@class = 'simple-error']"))));


        fillField(driver.findElement(By.xpath("//ruble-transfer-form-amount//input")), "100");
        click(getDriver().findElement(By.xpath("//span[@class = 'ng-star-inserted'][text() = 'Перевести']")));

        Assert.assertEquals("79101231233", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'По номеру телефона:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));
        Assert.assertEquals("Сидоров Петр Иванович", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'ФИО получателя:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));
        Assert.assertEquals("100,00 \u20BD", getText(driver.findElement(By.xpath("//div[@class = 'confirm-operation__attribute-label'][text() = 'Сумма перевода:']/following-sibling::div[@class = 'confirm-operation__attribute-value']"))));

    }

    public void elementClick(WebElement element, String value) {

        element.click();
        click(element.findElement(By.xpath("//*[text() = '" + value + "']")));

    }

}
