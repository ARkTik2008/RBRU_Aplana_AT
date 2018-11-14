package figureParamTest;

import figureParam.Circle;
import org.junit.Test;import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test @Ignore
    public void getSquareTest(){
        assertEquals(3.14, new Circle(1).getSquare(),0.05);
    }

    @Test @Ignore
    public void getPerimeterTest(){
        assertEquals(6.28, new Circle(1).getPerimeter(),0.05);
    }

}
