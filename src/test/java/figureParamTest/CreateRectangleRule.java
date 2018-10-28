package figureParamTest;

import figureParam.Rectangle;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.Random;

public class CreateRectangleRule implements TestRule {

    @Override
    public Statement apply(Statement statement, Description description) {

        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                double sizeA = new Random().nextDouble();
                double sizeB = new Random().nextDouble();
                Rectangle rectangle = new Rectangle(sizeA,sizeB);
            }
        };
    }
}
