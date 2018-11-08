package seleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class DepositTest extends BaseTest {

    @Test
    public void depositTest() {

        HashMap<String,String> testData = new HashMap<>();
        testData.put("Фамилия","Иванов");
        testData.put("Имя","Иван");
        testData.put("Отчество","Иванович");
        testData.put("Дата рождения","12121992");
        testData.put("Телефон","9101233355");
        testData.put("Город","Москва");
        testData.put("Отделение","508, дополнительный офис «Отделение «Сухаревское» м. Проспект Мира, г. Москва, пр. Мира, дом 3, корп. 1");

        WebDriver driver = getDriver();
        driver.get("https://www.raiffeisen.ru/");
        acceptRegion();
        click(getDriver().findElement(By.xpath("//a[contains(@class,'main-menu')][text() = 'Вклады']")));
        click(getDriver().findElement(By.xpath("//a[contains(@class,'menu-section')][text() = 'Накопительные счета']")));
        click(getDriver().findElement(By.xpath("//div[@class = 'b-card'][contains(.,'На каждый день')]/a[contains(@class,'link')]")));
        click(getDriver().findElement(By.xpath("//div[@class = 'b-intro']//a[@class = 'button'][text() = 'Оставить заявку']")));

    }

}