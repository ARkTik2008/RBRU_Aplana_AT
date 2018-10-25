package figureParam;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle(3,4,5);

        System.out.println(circle.getClass().getSimpleName());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getSquare());
        System.out.println(" ");
        System.out.println(triangle.getClass().getSimpleName());

        Double test = triangle.getSquare();

        System.out.println(test.doubleValue());


        System.out.println((Double)triangle.getPerimeter());
        System.out.println(triangle.getPerimeter() == 0.43);
        System.out.println(triangle.getSquare());
        System.out.println(" ");
        System.out.println(rectangle.getClass().getSimpleName());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getPerimeter() == 4);
        System.out.println(rectangle.getSquare() == 1.00);
        System.out.println(" ");

    }


}
