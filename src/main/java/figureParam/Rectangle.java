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
        if (sizeA < 0 || sizeB < 0) {
            throw new IllegalFigureParamException("Сторона фигуры не может быть отрицательной!");
        }
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    double calcSquare() {
        if (sizeA < 0 || sizeB < 0) {
            throw new IllegalFigureParamException("Сторона фигуры не может быть отрицательной!");
        }

        return sizeA * sizeB;
    }

    double calcPerimeter() {
        if (sizeA < 0 || sizeB < 0) {
            throw new IllegalFigureParamException("Сторона фигуры не может быть отрицательной!");
        }

        return 2 * (sizeA + sizeB);
    }


    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }
}
