package pr10.pr10_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ������� ��� ������ ������ � ���������
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("����", "������", "�����������", 3, "������ A", 4.5));
        students1.add(new Student("�����", "�������", "������", 2, "������ B", 4.1));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("�������", "�������", "����������", 4, "������ A", 3.8));
        students2.add(new Student("�����", "�������", "�����", 3, "������ C", 3.1));

        // ������� 2: ������� ������ SortingStudentsByGPA � ��������� ��� ������ ���������
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students1);
        sorter.setArray(students2);

        // ������� 2: ���������� �� �������� ����� (GPA)
        sorter.sortByGPA();

        // ������� 2: ����� ���������������� ������
        System.out.println("���������� �� GPA:");
        sorter.outArray();
    }
}