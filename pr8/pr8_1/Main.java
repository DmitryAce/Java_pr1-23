package pr8.pr8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("������� ���������� ���� (k): ");
        int k = scanner.nextInt();

        System.out.print("������� ����� ���� (s): ");
        int s = scanner.nextInt();

        int count = countNumbersWithSum(k, s);
        System.out.println("���������� �����: " + count);
    }

    // ������� ��� �������� ���������� k-������� ����� � ������ ���� s
    public static int countNumbersWithSum(int k, int s) {
        if (s < 1 || s > 9 * k) {
            // ���� ����� ���������� ��� k-������� �����, ���������� 0
            return 0;
        }

        // ���������� ����������� ������� ��� ��������
        return countNumbersWithSumHelper(k, s, 1, "");
    }

    // ��������������� ����������� ������� ��� ��������
    private static int countNumbersWithSumHelper(int k, int s, int startDigit, String currentNumber) {
        if (k == 0) {
            // ���� �������� ������� ���������� ����, ��������� �����
            if (s == 0) {
                // ���� ����� ���������, �� ����� ��������
                System.out.println(currentNumber); // ����� ����� ��� �������
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;

        for (int digit = startDigit; digit <= 9; digit++) {
            if (s - digit >= 0) {
                // ���������� �������� ������� ��� ���������� ����
                count += countNumbersWithSumHelper(k - 1, s - digit, 0, currentNumber + digit);
            }
        }

        return count;
    }
}
