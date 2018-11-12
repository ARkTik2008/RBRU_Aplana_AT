package patternLesson.steps;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import patternLesson.util.DriverManager;
import patternLesson.util.TestProperties;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseSteps {
    private static Properties properties = TestProperties.getInstance().getProperties();


    @Before
    public void  startScenario(){
        WebDriver driver = DriverManager.getDriver();
        driver.get(properties.getProperty("app.url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }



}
