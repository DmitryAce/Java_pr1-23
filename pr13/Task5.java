package pr13;

public class Task5 {
    public static void main(String[] args) {
        String str = "������ ������, ���������� ����� Java";

        // ���������, �������� �� ������ ��������� "Java"
        boolean containsJava = str.contains("Java");

        if (containsJava) {
            System.out.println("������ �������� ��������� 'Java'.");
        } else {
            System.out.println("������ �� �������� ��������� 'Java'.");
        }
    }
}
