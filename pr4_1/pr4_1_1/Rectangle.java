package pr4_1.pr4_1_1;

// Дочерний класс Rectangle (Прямоугольник)
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return "Прямоугольник";
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
