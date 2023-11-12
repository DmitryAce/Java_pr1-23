package pr6.pr6_1and2;

public class Main {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint(1, 2, 1, 1);
        MovablePoint point2 = new MovablePoint(4, 5, 1, 1);

        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 5, 1, 1);

        System.out.println("Initial Point 1: " + point1);
        System.out.println("Initial Point 2: " + point2);
        System.out.println("Initial Rectangle: " + rectangle);

        point1.moveUp();
        point2.moveDown();
        rectangle.moveLeft();

        System.out.println("Point 1 after moving up: " + point1);
        System.out.println("Point 2 after moving down: " + point2);
        System.out.println("Rectangle after moving left: " + rectangle);
    }
}

