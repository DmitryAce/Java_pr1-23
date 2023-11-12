package pr9.pr9_2;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 3.8),
                new Student("Bob", 3.9),
                new Student("Charlie", 3.5),
                new Student("David", 4.0),
                new Student("Eve", 3.7)
        };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        SortingStudentsByGPA.quickSort(students, 0, students.length - 1, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}