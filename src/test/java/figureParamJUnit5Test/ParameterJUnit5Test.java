package figureParamJUnit5Test;

import figureParam.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterJUnit5Test {
    @ParameterizedTest
    @CsvSource({"0,0,0", "1,2,6", "10,10,40"})
    @DisplayName("Тест с параметром")
    void testParams(double sizeA, double sizeB, double result){
        Assertions.assertEquals(result, new Rectangle(sizeA,sizeB).getPerimeter());
    }
}
