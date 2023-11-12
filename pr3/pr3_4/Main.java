package pr3.pr3_4;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ����������� � ������������ ������ �������
        int n;
        do {
            System.out.print("������� ������ ������� (����������� ����� ������ 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("������� ���������� �����: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // ������� ������ �� n ��������� ����� ����� � ��������� [0; n]
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        // ������� �������� ������ �� �����
        System.out.println("�������� ������:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // ��������� �� ����� ������

        // ������� ������ ������ �� ������ ��������� ������� �������
        int[] evenArray = new int[n]; // ������������, ��� ���� ������ ����� �������� ������
        int evenCount = 0; // ������� ������ ���������
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }

        // ������� ������ ������ �� �����
        System.out.println("������ ������ (������ ��������):");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
