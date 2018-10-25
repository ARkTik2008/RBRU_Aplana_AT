package figureParam;

public abstract class Figure {
    double square;
    double perimeter;


    abstract double calcSquare();
    abstract double calcPerimeter();

    public double getSquare() {
        return calcSquare() ;
    }

    public double getPerimeter() {
        return calcPerimeter();
    }
}
