package figureParamJUnit5Test;

import calculatorJUnit5.Division;
import calculatorJUnit5.DivisionException;
import figureParam.Rectangle;
import figureParam.SizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class sizeRectangleExceptionTest {

    @Test
    void sizeAGetPerimeterTriangleException() {
        Throwable exception =
                Assertions.assertThrows(SizeException.class, () -> new Rectangle(-1, 1).getPerimeter());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeBGetPerimeterTriangleException() {
        Throwable exception =
                Assertions.assertThrows(SizeException.class, () -> new Rectangle(1, -1).getPerimeter());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeAGetSquareTriangleException() {
        Throwable exception =
                Assertions.assertThrows(SizeException.class, () -> new Rectangle(-1, 1).getSquare());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeBGetSquareTriangleException() {
        Throwable exception =
                Assertions.assertThrows(SizeException.class, () -> new Rectangle(1, -1).getSquare());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }


}
