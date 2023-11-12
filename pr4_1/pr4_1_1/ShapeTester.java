package pr4_1.pr4_1_1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);

        // Вывод информации о фигурах
        System.out.println("Тип: " + circle.getType());
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Периметр: " + circle.getPerimeter());

        System.out.println("\nТип: " + rectangle.getType());
        System.out.println("Площадь: " + rectangle.getArea());
        System.out.println("Периметр: " + rectangle.getPerimeter());

        System.out.println("\nТип: " + square.getType());
        System.out.println("Площадь: " + square.getArea());
        System.out.println("Периметр: " + square.getPerimeter());
    }
}
