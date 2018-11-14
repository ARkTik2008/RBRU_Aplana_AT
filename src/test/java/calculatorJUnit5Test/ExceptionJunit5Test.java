package calculatorJUnit5Test;

import calculatorJUnit5.Division;
import calculatorJUnit5.DivisionException;
import org.junit.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionJunit5Test {


    @Test @Ignore
    void divisionTest() {
        Throwable exception =
                Assertions.assertThrows(DivisionException.class, () -> new Division(1, 0).calculateResult());
        Assertions.assertEquals("На 0 делить нельзя", exception.getMessage());
    }
}
