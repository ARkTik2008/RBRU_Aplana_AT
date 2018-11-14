package calculatorTest;

import calculator.Division;
import calculator.DivisionException;
import org.junit.Rule;
import org.junit.Test;import org.junit.Ignore;
import org.junit.rules.ExpectedException;

public class ExceptionTest {


    @Test @Ignore(expected = DivisionException.class)
    public void testException(){
        Division division = new Division(1,0);
        division.calculateResult();
    }

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test @Ignore
    public void testException2(){
        Division division = new Division(1, 0);
        exception.expect(DivisionException.class);
        exception.expectMessage("На 0 делить нельзя");
        division.calculateResult();
    }

}
