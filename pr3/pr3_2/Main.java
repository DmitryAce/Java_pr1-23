package pr3.pr3_2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5); // Создаем объект Tester с возможностью хранения 5 окружностей

        // Генерируем и добаляем случайные окружности в массив
        Random random = new Random();
        for (int i = 0; i < 5; i++)
        {
            double x = random.nextDouble()*10;
            double y = random.nextDouble()*10;
            double radius = random.nextDouble()*5;

            Point center = new Point(x,y);
            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        // Находим и выводим самую маленькую окружность
        Circle smallestCircle = tester.findSmallestCircle();
        if (smallestCircle != null){
            System.out.println("Самая маленькая окружность:");
            System.out.println("Радиус: " + smallestCircle.getRadius());
            System.out.println("Длина окружности " + smallestCircle.getCircumference());
        } else {
            System.out.println("\nМассив окружности пуст");
        }

        // Находим и выводим самую маленькую окружность
        Circle largestCircle = tester.findLargestCircle();
        if (largestCircle != null){
            System.out.println("Самая большая окружность:");
            System.out.println("Радиус: " + largestCircle.getRadius());
            System.out.println("Длина окружности " + largestCircle.getCircumference());
        } else {
            System.out.println("\nМассив окружности пуст");
        }

        // Сортируем окружности по радиусу
        tester.sortCirclesByRadius();

        // Выводим отсортированный массив окружностей
        System.out.println("\nОтсортированный массив окружностей по радиусу:");
        Circle[] sortedCircles = tester.getCircles();
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println("Радиус: " + sortedCircles[i].getRadius());
            System.out.println("Длина окружности: " + sortedCircles[i].getCircumference());
        }
    }
}
