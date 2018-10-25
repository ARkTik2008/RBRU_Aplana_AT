package figureParam;

public class Circle extends Figure {

    double PI = 3.14;
    double radius;

    double calcSquare() {
        return PI * radius * radius;
    }

    double calcPerimeter() {
        return 2 * PI * radius;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }
}
