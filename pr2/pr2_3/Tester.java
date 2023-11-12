package pr2.pr2_3;

public class Tester {
    private Circle[] circles;
    private int numberOfCircles;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        numberOfCircles = 0;
    }

    public void addCircle(Circle circle) {
        if (numberOfCircles < circles.length) {
            circles[numberOfCircles] = circle;
            numberOfCircles++;
        } else {
            System.out.println("Массив полон. Невозможно добавить больше окружностей.");
        }
    }

    public int getNumberOfCircles() {
        return numberOfCircles;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Point center1 = new Point(1.0, 2.0);
        Circle circle1 = new Circle(center1, 3.0);

        Point center2 = new Point(-2.0, 0.0);
        Circle circle2 = new Circle(center2, 2.5);

        tester.addCircle(circle1);
        tester.addCircle(circle2);

        System.out.println("Количество окружностей: " + tester.getNumberOfCircles());

        for (Circle circle : tester.getCircles()) {
            if (circle != null) {
                System.out.println("Окружность с центром в точке (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ") и радиусом " + circle.getRadius());
            }
        }
    }
}

