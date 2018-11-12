package seleniumTest;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriverWait wait;
    public static WebDriver driver;


    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void afterScenario() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver,5);

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
    }

    @AfterEach
    public void afterMethod() {
        driver.quit();
    }

    public void click(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public String getText(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
    public String getAttribute(WebElement element, String attr){
        return element.getAttribute(attr);
    }

    public void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
        element.sendKeys(Keys.TAB);
    }

    public void scrollAndClick(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("return arguments[0].scrollIntoView(false):",element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    //public void selectInput(WebElement element){ }
    public void acceptRegion(){
        click(getDriver().findElement(By.xpath("//*[text() = 'Да']")));
    }

    public void selectInput(WebElement element, String value) {
        element.click();
        element.findElement(By.xpath(".//div[contains(@class,'choices__item')][contains(text(),'" + value + "')]")).click();
    }

    public boolean isElementPresent(By locator) {
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        try {
            return getDriver().findElement(locator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        }
    }


}
