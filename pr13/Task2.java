package pr13;

public class Task2 {
    public static void main(String[] args) {
        String str = "������ ������";

        // �������� ����� ������
        int length = str.length();

        // ���������, ��� ������ �� �����
        if (length > 0) {
            // ������ ���������� ������� ����� ����� ������ ����� 1
            char lastChar = str.charAt(length - 1);

            // ������� ��������� ������ �� �����
            System.out.println("��������� ������ ������: " + lastChar);
        } else {
            // ���� ������ �����, ������� ��������� �� ����
            System.out.println("������ �����, ������ �������� ��������� ������.");
        }
    }
}
