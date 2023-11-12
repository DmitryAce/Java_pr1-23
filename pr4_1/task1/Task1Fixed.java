package pr4_1.task1;
/*
� ������ Circle to Shape System.out.println(s1);//which version?
��� ������������� � ����� "Circle to Shape".
������ ����� System.out.println(s1) ����� ��������.
*/

public class Task1Fixed{
    public static void main(String[] args) {
        Circle c1 = new Circle(5.5, "RED", false); // ������� ������ Circle
        Shape s1 = c1; // Upcast Circle � Shape

        System.out.println(s1); // ���������� ������ ������ toString() �� Circle
        System.out.println(s1.getArea()); // ���������� ������ ������ getArea() �� Circle
        // ��� ������ getPerimeter() � Shape, ��� ��� ��� ������� ������ ����������.

        System.out.println(s1.getColor()); // ���������� ������ ������ getColor() �� Circle
        System.out.println(s1.isFilled()); // ���������� ������ ������ isFilled() �� Circle
        // ��� ������ getRadius() � Shape, ��� ��� ��� ������� ������ ����������.

        Circle c2 = (Circle) s1; // Downcast ������� � Circle
        System.out.println(c2);

        System.out.println(c2.getArea());
        System.out.println(c2.getColor());
        System.out.println(c2.isFilled());
        System.out.println(c2.getRadius());

        Shape s2 = new Rectangle(1.0, 2.0, "RED", false); // ������� ������ Rectangle
        System.out.println(s2);

        System.out.println(s2.getArea()); // ���������� ������ ������ getArea() �� Rectangle
        System.out.println(s2.getColor()); // ���������� ������ ������ getColor() �� Rectangle
        // ��� ������ getPerimeter() � getLength() � Shape, ��� ��� ��� ������� ������ ����������.

        Rectangle r1 = (Rectangle) s2; // Downcast ������� � Rectangle
        System.out.println(r1);

        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s3 = new Square(6.6); // ������� ������ Square
        System.out.println(s3);

        System.out.println(s3.getArea()); // ���������� ������ ������ getArea() �� Square
        System.out.println(s3.getColor()); // ���������� ������ ������ getColor() �� Square
        // ��� ������ getSide() � Shape, ��� ��� ��� ������� ������ ����������.

        Square sq1 = (Square) s3; // Downcast ������� � Square
        System.out.println(sq1);

        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
    }
}
class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "," + super.toString() + "]";
    }
}

class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "," + super.toString() + "]";
    }
}

class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth(); // ��������� ������� �������� �����, �� ����� ������������ ����� �� ���
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square[side=" + getSide() + "," + super.toString() + "]";
    }
}
