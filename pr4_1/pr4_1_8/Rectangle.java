package pr4_1.pr4_1_8;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", height=" + height +
                '}'+"\n";
    }
}


