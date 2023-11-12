package pr3.pr3_3;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] array = new int[n];
        Random random = new Random();

        // ��������� ������ ���������� ������ ������� �� 10 �� 99
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(90) + 10; // ���������� �� 10 �� 99
        }

        // ������� ������ �� �����
        System.out.print("������: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // ��������� �� ����� ������

        // ���������, �������� �� ������ ������ ������������ �������������������
        boolean isIncreasing = true;
        for (int i = 1; i < n; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break; // ���� ������ ���� �� ���� �������� ������������ �������, ������� �� �����
            }
        }

        // ������� ���������
        if (isIncreasing) {
            System.out.println("������ �������� ������ ������������ �������������������.");
        } else {
            System.out.println("������ �� �������� ������ ������������ �������������������.");
        }
    }
}
