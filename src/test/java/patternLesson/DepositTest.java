package patternLesson;

import org.junit.Test;import org.junit.Ignore;
import patternLesson.pages.MainPage;

public class DepositTest {

    @Test @Ignore
    public void testMethod(){
        MainPage mainPage = new MainPage();
        mainPage.selectMenuItem("Вклады");
    }

}
