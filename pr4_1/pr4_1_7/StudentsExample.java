package pr4_1.pr4_1_7;

public class StudentsExample {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new SchoolStudent("Дима", 10);
        students[1] = new SchoolStudent("Ваня", 8);
        students[2] = new CollegeStudent("Миша", "РТУ МИРЭА");
        students[3] = new CollegeStudent("Максим", "МАИ");
        students[4] = new Student("Саша");

        System.out.println("Студенты вузов:");
        for (Student student : students) {
            if (student instanceof CollegeStudent) {
                CollegeStudent collegeStudent = (CollegeStudent) student;
                System.out.println("Имя: " + collegeStudent.getName() + ", Университет: " + collegeStudent.getUniversity());
            }
        }

        System.out.println("\nШкольники:");
        for (Student student : students) {
            if (student instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) student;
                System.out.println("Имя: " + schoolStudent.getName() + ", Класс: " + schoolStudent.getGrade());
            }
        }
    }
}