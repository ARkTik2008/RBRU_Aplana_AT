package figureParamTest;

import figureParam.Circle;
import figureParam.IllegalFigureParamException;
import org.junit.Rule;
import org.junit.Test;import org.junit.Ignore;
import org.junit.rules.ExpectedException;

public class sizeCircleExceptionTest {


    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test @Ignore
    public void radiusGetPerimeterCircleException() {
        Circle circle = new Circle(-1);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Радиус окружности не может быть отрицательным!");
        circle.getPerimeter();
    }
    @Test @Ignore
    public void radiusGetSquareCircleException() {
        Circle circle = new Circle(-1);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Радиус окружности не может быть отрицательным!");
        circle.getPerimeter();
    }






}
