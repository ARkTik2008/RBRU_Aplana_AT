package calculator;

import calculator.Operation;

public class Addition extends Operation {

    public Addition(float number1, float number2) {
        super(number1, number2);
    }

    public float calculateResult() {
        return getNumber1() + getNumber2();
    }

    public String getSign() {
        return "+";
    }
}