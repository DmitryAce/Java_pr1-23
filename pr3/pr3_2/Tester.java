package pr3.pr3_2;
import java.util.Arrays;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity){
        circles = new Circle[capacity];
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void addCircle(Circle circle){
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей полон. Нельзя добавить больше элементов.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0){
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < count; i++){
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }

        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (count ==0){
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 0; i < count; i ++){
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }

        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles,0,count,(circle1,circle2) ->  Double.compare(circle1.getRadius(), circle2.getRadius()));
    }

}
