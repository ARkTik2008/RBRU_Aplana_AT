package figureParamTest;

import figureParam.Triangle;
import figureParam.IllegalFigureParamException;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;import org.junit.Ignore;
import org.junit.rules.ExpectedException;

public class sizeTriangleExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test @Ignore
    public void sizeAGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(-5, 3, 3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test @Ignore
    public void sizeBGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(5, -3, 3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test @Ignore
    public void sizeCGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(5, 3, -3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test @Ignore
    public void sizeAGetSquareTriangleException() {
        Triangle triangle = new Triangle(-5, 3, 3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }

    @Test @Ignore
    public void sizeBGetSquareTriangleException() {
        Triangle triangle = new Triangle(5, -3, 3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }

    @Test @Ignore
    public void sizeCGetSquareTriangleException() {
        Triangle triangle = new Triangle(5, 3, -3);
        exception.expect(IllegalFigureParamException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }
}
