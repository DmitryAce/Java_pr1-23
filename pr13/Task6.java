package pr13;

public class Task6 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // ���� ������� ��������� "Java" � ������
        int position = str.indexOf("Java");

        if (position != -1) {
            System.out.println("��������� 'Java' ������� � �������: " + position);
        } else {
            System.out.println("��������� 'Java' �� ������� � ������.");
        }
    }
}
