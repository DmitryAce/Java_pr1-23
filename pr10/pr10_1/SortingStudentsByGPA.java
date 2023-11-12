package pr10.pr10_1;

import java.util.*;

// Задание 2: Создаем класс SortingStudentsByGPA
class SortingStudentsByGPA {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    // Метод для заполнения массива студентов
    public void setArray(List<Student> students) {
        iDNumber.addAll(students);
    }

    // Метод для сортировки по среднему баллу (GPA)
    public void sortByGPA() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public List<Student> getIDNumber() {
        return iDNumber;
    }
}
