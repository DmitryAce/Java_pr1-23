package pr8.pr8_2;

public class Main {
    public static void main(String[] args) {
        int N = 12345; // �������� �� ���� ����������� �����
        int sum = sumOfDigits(N);
        System.out.println("����� ���� ����� " + N + " ����� " + sum);
    }

    // ����������� ������� ��� ���������� ����� ���� �����
    public static int sumOfDigits(int N) {
        if (N == 0) {
            // ������� ������: ���� ����� ����� 0, ���������� 0
            return 0;
        } else {
            // ���������� �������� ������� ��� ���������� ���� �����
            int lastDigit = N % 10; // �������� ��������� ����� �����
            int remainingDigits = N / 10; // �������� ����� ��� ��������� �����
            return lastDigit + sumOfDigits(remainingDigits);
        }
    }
}
