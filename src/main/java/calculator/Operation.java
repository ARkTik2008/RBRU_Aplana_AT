package calculator;

public abstract class Operation {
    private float number1;
    private float number2;

    Operation(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }
}