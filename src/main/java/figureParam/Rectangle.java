package figureParam;

public class Rectangle extends Figure {

    double sizeA;
    double sizeB;

    public Rectangle() {
        this.sizeA = 1;
        this.sizeB = 1;
    }

    public Rectangle(double sizeA, double sizeB) {
        this();
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    double calcSquare() {
        return sizeA * sizeB;
    }

    double calcPerimeter() {
        return 2 * (sizeA + sizeB);
    }


    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }
}
