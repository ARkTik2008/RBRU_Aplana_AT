package figureParamTest;

import figureParam.Rectangle;
import figureParam.IllegalFigureParamException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class sizeRectangleExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();




    @Test
    public void testRule(){
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        new Rectangle(-1,0);
    }





    @Test
    public void sizeAGetPerimeterRectangleException() {
        Rectangle rectangle = new Rectangle(-5, 5);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        rectangle.getPerimeter();
    }

    @Test
    public void sizeBGetPerimeterRectangleException() {
        Rectangle rectangle = new Rectangle(5, -5);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        rectangle.getPerimeter();
    }

    @Test
    public void sizeAGetSquareRectangleException() {
        Rectangle rectangle = new Rectangle(-5, 5);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        rectangle.getSquare();
    }

    @Test
    public void sizeBGetSquareRectangleException() {
        Rectangle rectangle = new Rectangle(5, -5);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        rectangle.getSquare();
    }
}
