package figureParamJUnit5Test;

import figureParam.Rectangle;
import figureParam.IllegalFigureParamException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sizeRectangleExceptionTest {

    @Test
    void sizeAGetPerimeterTriangleException() {
        Throwable exception =
                Assertions.assertThrows(IllegalFigureParamException.class, () -> new Rectangle(-1, 1).getPerimeter());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeBGetPerimeterTriangleException() {
        Throwable exception =
                Assertions.assertThrows(IllegalFigureParamException.class, () -> new Rectangle(1, -1).getPerimeter());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeAGetSquareTriangleException() {
        Throwable exception =
                Assertions.assertThrows(IllegalFigureParamException.class, () -> new Rectangle(-1, 1).getSquare());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }
    @Test
    void sizeBGetSquareTriangleException() {
        Throwable exception =
                Assertions.assertThrows(IllegalFigureParamException.class, () -> new Rectangle(1, -1).getSquare());
        Assertions.assertEquals("Сторона фигуры не может быть отрицательной!", exception.getMessage());
    }


}
