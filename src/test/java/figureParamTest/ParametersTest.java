package figureParamTest;

import figureParam.Rectangle;
import org.junit.Assert;
import org.junit.Test;import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParametersTest {


    @Parameterized.Parameter
    public double sizeA;
    @Parameterized.Parameter(1)
    public double sizeB;
    @Parameterized.Parameter(2)
    public double result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0, 0}, {1, 2, 6}, {10, 10, 40}
        });
    }

    @Test @Ignore
    public void testMethod() {
        Assert.assertEquals(result, new Rectangle(sizeA, sizeB).getPerimeter(), 0.0);
    }
}
