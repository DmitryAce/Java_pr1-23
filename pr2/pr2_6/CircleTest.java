package pr2.pr2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        System.out.println("Круг 1:");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Длина окружности: " + circle1.calculateCircumference());

        System.out.println("\nКруг 2:");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Площадь: " + circle2.calculateArea());
        System.out.println("Длина окружности: " + circle2.calculateCircumference());

        System.out.println("\nРавны ли круги? " + circle1.equals(circle2));
    }
}
