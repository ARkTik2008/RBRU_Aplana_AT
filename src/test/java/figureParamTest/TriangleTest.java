package figureParamTest;

import figureParam.Circle;
import figureParam.Triangle;
import org.junit.Ignore;
import org.junit.Test;import org.junit.Ignore;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test @Ignore
    public void getSquareTest(){
        assertEquals(6, new Triangle(3,4,5).getSquare(),0.05);
    }

    @Test @Ignore
    public void getPerimeterTest(){
        assertEquals(12, new Triangle(3,4,5).getPerimeter(),0.05);
    }

}
