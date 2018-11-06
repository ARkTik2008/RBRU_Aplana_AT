package seleniumTest;

import org.junit.jupiter.api.Test;
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



    }

}
