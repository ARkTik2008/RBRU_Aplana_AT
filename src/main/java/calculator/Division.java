package calculator;

public class Division extends Operation {

    public Division(float number1, float number2) {
        super(number1, number2);
    }

    public float calculateResult() {
        if (getNumber2() == 0){
            throw new DivisionException("На 0 делить нельзя!");
        }
        return getNumber1() / getNumber2();
    }

    public String getSign() {
        return "/";
    }
}