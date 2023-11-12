package pr3.pr3_2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5); // ������� ������ Tester � ������������ �������� 5 �����������

        // ���������� � �������� ��������� ���������� � ������
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

        // ������� � ������� ����� ��������� ����������
        Circle smallestCircle = tester.findSmallestCircle();
        if (smallestCircle != null){
            System.out.println("����� ��������� ����������:");
            System.out.println("������: " + smallestCircle.getRadius());
            System.out.println("����� ���������� " + smallestCircle.getCircumference());
        } else {
            System.out.println("\n������ ���������� ����");
        }

        // ������� � ������� ����� ��������� ����������
        Circle largestCircle = tester.findLargestCircle();
        if (largestCircle != null){
            System.out.println("����� ������� ����������:");
            System.out.println("������: " + largestCircle.getRadius());
            System.out.println("����� ���������� " + largestCircle.getCircumference());
        } else {
            System.out.println("\n������ ���������� ����");
        }

        // ��������� ���������� �� �������
        tester.sortCirclesByRadius();

        // ������� ��������������� ������ �����������
        System.out.println("\n��������������� ������ ����������� �� �������:");
        Circle[] sortedCircles = tester.getCircles();
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println("������: " + sortedCircles[i].getRadius());
            System.out.println("����� ����������: " + sortedCircles[i].getCircumference());
        }
    }
}
