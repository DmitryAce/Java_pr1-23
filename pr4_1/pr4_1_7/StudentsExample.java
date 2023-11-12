package pr4_1.pr4_1_7;

public class StudentsExample {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("����", 10);
        students[1] = new SchoolStudent("����", 8);
        students[2] = new CollegeStudent("����", "��� �����");
        students[3] = new CollegeStudent("������", "���");
        students[4] = new Student("����");

        System.out.println("�������� �����:");
        for (Student student : students) {
            if (student instanceof CollegeStudent) {
                CollegeStudent collegeStudent = (CollegeStudent) student;
                System.out.println("���: " + collegeStudent.getName() + ", �����������: " + collegeStudent.getUniversity());
            }
        }

        System.out.println("\n���������:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("���: " + schoolStudent.getName() + ", �����: " + schoolStudent.getGrade());
            }
        }
    }
}