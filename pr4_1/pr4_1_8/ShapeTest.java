package pr4_1.pr4_1_8;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true, 5.0);
        Rectangle rectangle = new Rectangle("Blue", false, 4.0, 6.0);
        Square square = new Square("Green", true, 4.0);

        // Вывод информации о фигурах
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        // Вычисление и вывод площади и периметра
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
