package pr9.pr9_2;
import java.util.Comparator;

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по убыванию итоговых баллов (GPA)
        return Double.compare(student2.getGpa(), student1.getGpa());
    }

    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(arr, low, high, comparator);
            quickSort(arr, low, pi - 1, comparator);
            quickSort(arr, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] arr, int low, int high, Comparator<Student> comparator) {
        Student pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (comparator.compare(arr[j], pivot) > 0) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] arr, int i, int j) {
        Student temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}