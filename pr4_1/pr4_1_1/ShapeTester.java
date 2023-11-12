package pr4_1.pr4_1_1;

public class ShapeTester {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);

        // ����� ���������� � �������
        System.out.println("���: " + circle.getType());
        System.out.println("�������: " + circle.getArea());
        System.out.println("��������: " + circle.getPerimeter());

        System.out.println("\n���: " + rectangle.getType());
        System.out.println("�������: " + rectangle.getArea());
        System.out.println("��������: " + rectangle.getPerimeter());

        System.out.println("\n���: " + square.getType());
        System.out.println("�������: " + square.getArea());
        System.out.println("��������: " + square.getPerimeter());
    }
}
