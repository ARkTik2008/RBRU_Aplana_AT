package calculatorJUnit5Test;

import calculatorJUnit5.Addition;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterJUnit5Test {

    @ParameterizedTest
    @CsvSource({"0,0,0", "1,1,2", "2,2,4"})
    @DisplayName("Тест с параметром")
    void testParams(float number1, float number2, double result){

        Assertions.assertEquals(result, new Addition(number1,number2).calculateResult());
    }
}
