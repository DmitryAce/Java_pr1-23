package pr2.pr2_6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        System.out.println("���� 1:");
        System.out.println("������: " + circle1.getRadius());
        System.out.println("�������: " + circle1.calculateArea());
        System.out.println("����� ����������: " + circle1.calculateCircumference());

        System.out.println("\n���� 2:");
        System.out.println("������: " + circle2.getRadius());
        System.out.println("�������: " + circle2.calculateArea());
        System.out.println("����� ����������: " + circle2.calculateCircumference());

        System.out.println("\n����� �� �����? " + circle1.equals(circle2));
    }
}
