package patternLesson;

import org.junit.Test;
import patternLesson.pages.MainPage;

public class DepositTest {

    @Test
    public void testMethod(){
        MainPage mainPage = new MainPage();
        mainPage.selectMenuItem("Вклады");
    }

}
