package figureParamTest;

import figureParam.Rectangle;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {


    @Rule
    public CreateRectangleRule rectangleRule = new CreateRectangleRule();

    @Test
    public void getSquareTest() {
        assertEquals(1, new Rectangle(1, 1).getSquare(), 0.05);
    }

    @Test
    public void getPerimeterTest() {
        assertEquals(4, new Rectangle(1, 1).getPerimeter(), 0.05);
    }
}
