package pr2.pr2_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("������� �����:");
        String inputText = scanner.nextLine();

        // ��������� ��������� ����� �� ����� � �������������� �������� � �������� ������������
        String[] words = inputText.split("\\s+");

        // ������������ ���������� ����
        int wordCount = words.length;

        System.out.println("���������� ���� � ������: " + wordCount);

        scanner.close();
    }
}

/*
� ���� ���� \\s+ - ��� ���������� ���������, ������� ������������� ������ ��� ����� ��������
(��� ������ ���������� ��������, ����� ��� ��������� ��� ������� ������). ����� �������,
����� ����� �������� �� �����, � ���� ���� ������� ��������� �������� ������,
��� ����� ��������� ����� ������������.
 */