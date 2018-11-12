package seleniumTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsuranceTest extends BaseTest {

    @Test
    public void InsuranceTest() throws InterruptedException {


        WebDriver driver = getDriver();

        driver.get("https://www.raiffeisen.ru/");

        click(getDriver().findElement(By.xpath("//a[contains(@class,'main-menu')][text() = 'Страхование']")));
        click(getDriver().findElement(By.xpath("//div[@class = 'menu-block'][contains(.,'В путешествие')]/a")));
        click(getDriver().findElement(By.xpath("//div[@class = 'b-intro']//a[@class = 'button'][text() = 'Оставить заявку']")));

        Assertions.assertEquals("Форма заявки на страховую программу", getText(driver.findElement(By.xpath("//h1[contains(@class,'e-title')]"))));
        Assertions.assertEquals("Вояж (Комфорт/Бизнес класс/Первый класс)", getText(driver.findElement(By.xpath("//span[@class = 'ui-selectmenu-text']"))));

        fillField(driver.findElement(By.xpath("//input[@placeholder = 'Фамилия']")),
                "Иванов");
        fillField(driver.findElement(By.xpath("//input[@placeholder = 'Имя']")),
                "Иван");
        fillField(driver.findElement(By.xpath("//input[@placeholder = 'Отчество']")),
                "Иванович");
        fillField(driver.findElement(By.xpath("//input[@placeholder = 'Дата Рождения']")),
                "01011990");
        fillField(driver.findElement(By.xpath("//input[@sys_name= 'phone']")),
                "9685139281");
        fillField(driver.findElement(By.xpath("//input[@placeholder= 'Электронная почта']")),
                "test@yandex.ru");
        fillField(driver.findElement(By.xpath("//input[@placeholder = 'Проверочный код']")),
                "1234");
        click(driver.findElement(By.xpath("//div[@class = 'checkbox-block']//span[@class = 'checkbox-block__span']")));

        Assertions.assertEquals("button", getAttribute(driver.findElement(By.xpath("//button[@type = 'submit']")), "className"));
    }
}