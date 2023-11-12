package pr8.pr8_3;

public class Main {
    public static void main(String[] args) {
        int n = 211; // �������� �� ���� ����������� �����

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // ����������� ������� ��� �������� ����� �� ��������
    // current - ������� ��������, ������� � 2
    public static boolean isPrime(int n, int current) {
        if (n <= 1) {
            return false; // ����� ������ ��� ����� 1 �� �������� �������
        }

        if (current * current > n) {
            return true; // ��������� ������ �� �������, ����� �������
        }

        if (n % current == 0) {
            return false; // ������ ��������, ����� ���������
        }

        // ���������� �������� ������� ��� ���������� ��������
        return isPrime(n, current + 1);
    }
}
