package figureParam;

public class Circle extends Figure {

    double PI = 3.14;
    double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this();
        if (radius < 0){
            throw new IllegalFigureParamException("Радиус окружности не может быть отрицательным!");
        }
        this.radius = radius;
    }

    double calcSquare() {

        if (radius < 0) {
            throw new IllegalFigureParamException("Радиус окружности не может быть отрицательным!");
        }
        return PI * radius * radius;
    }

    double calcPerimeter() {

        if (radius < 0) {
            throw new IllegalFigureParamException("Радиус окружности не может быть отрицательным!");
        }
        return 2 * PI * radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

}
