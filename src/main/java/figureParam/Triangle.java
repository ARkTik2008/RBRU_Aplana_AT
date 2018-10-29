package figureParam;

public class Triangle extends Figure {

    double sizeA;
    double sizeB;
    double sizeС;

    public Triangle() {
        this.sizeA = 1;
        this.sizeB = 1;
        this.sizeС = 1;
    }

    public Triangle(double sizeA, double sizeB, double sizeС) {
        this();
        this.sizeA = sizeA;
        this.sizeB = sizeB;
        this.sizeС = sizeС;
    }

    double calcSquare() {
        double halfPerimeter;
        double square;

        if (sizeA < 0 || sizeB < 0 || sizeС < 0){
            throw new IllegalFigureParamException("Сторона фигуры не может быть отрицательной!");
        }

        halfPerimeter = (sizeA + sizeB + sizeС) / 2;
        square = Math.sqrt(halfPerimeter * (halfPerimeter - sizeA) * (halfPerimeter - sizeB) * (halfPerimeter - sizeС));

        return square;
    }

    double calcPerimeter() {

        if (sizeA < 0 || sizeB < 0 || sizeС < 0){
            throw new IllegalFigureParamException("Сторона фигуры не может быть отрицательной!");
        }

        return sizeA + sizeB + sizeС;
    }
}
