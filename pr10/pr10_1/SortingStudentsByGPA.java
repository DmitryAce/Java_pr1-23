package pr10.pr10_1;

import java.util.*;

// ������� 2: ������� ����� SortingStudentsByGPA
class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    // ����� ��� ���������� ������� ���������
    public void setArray(List<Student> students) {
        iDNumber.addAll(students);
    }

    // ����� ��� ���������� �� �������� ����� (GPA)
    public void sortByGPA() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // ����� ��� ������ ������� ���������
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public List<Student> getIDNumber() {
        return iDNumber;
    }
}
