package figureParamTest;

import figureParam.Circle;
import figureParam.Triangle;
import figureParam.sizeException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class sizeTriangleExceptionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void sizeAGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(-5, 3, 3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test
    public void sizeBGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(5, -3, 3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test
    public void sizeCGetPerimeterTriangleException() {
        Triangle triangle = new Triangle(5, 3, -3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getPerimeter();
    }

    @Test
    public void sizeAGetSquareTriangleException() {
        Triangle triangle = new Triangle(-5, 3, 3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }

    @Test
    public void sizeBGetSquareTriangleException() {
        Triangle triangle = new Triangle(5, -3, 3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }

    @Test
    public void sizeCGetSquareTriangleException() {
        Triangle triangle = new Triangle(5, 3, -3);
        exception.expect(sizeException.class);
        exception.expectMessage("Сторона фигуры не может быть отрицательной!");
        triangle.getSquare();
    }
}
