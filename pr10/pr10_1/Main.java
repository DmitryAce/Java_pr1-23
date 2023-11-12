package pr10.pr10_1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем два списка данных о студентах
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иван", "Петров", "Информатика", 3, "Группа A", 4.5));
        students1.add(new Student("Мария", "Иванова", "Физика", 2, "Группа B", 4.1));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Алексей", "Сидоров", "Математика", 4, "Группа A", 3.8));
        students2.add(new Student("Елена", "Козлова", "Химия", 3, "Группа C", 3.1));

        // Задание 2: Создаем объект SortingStudentsByGPA и заполняем его массив студентов
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.setArray(students1);
        sorter.setArray(students2);

        // Задание 2: Сортировка по среднему баллу (GPA)
        sorter.sortByGPA();

        // Задание 2: Вывод отсортированного списка
        System.out.println("Сортировка по GPA:");
        sorter.outArray();
    }
}