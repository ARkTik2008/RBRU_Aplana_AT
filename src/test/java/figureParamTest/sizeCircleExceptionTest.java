package figureParamTest;

import calculator.Division;
import calculator.DivisionException;
import figureParam.Circle;
import figureParam.Triangle;
import figureParam.sizeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class sizeCircleExceptionTest {


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void radiusGetPerimeterCircleException() {
        Circle circle = new Circle(-1);
        exception.expect(sizeException.class);
        exception.expectMessage("Радиус окружности не может быть отрицательным!");
        circle.getPerimeter();
    }
    @Test
    public void radiusGetSquareCircleException() {
        Circle circle = new Circle(-1);
        exception.expect(sizeException.class);
        exception.expectMessage("Радиус окружности не может быть отрицательным!");
        circle.getPerimeter();
    }






}
