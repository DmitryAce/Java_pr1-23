package pr3.pr3_3;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] array = new int[n];
        Random random = new Random();

        // Заполняем массив случайными целыми числами от 10 до 99
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(90) + 10; // Генерируем от 10 до 99
        }

        // Выводим массив на экран
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Проверяем, является ли массив строго возрастающей последовательностью
        boolean isIncreasing = true;
        for (int i = 1; i < n; i++) {
            if (array[i] <= array[i - 1]) {
                isIncreasing = false;
                break; // Если найден хотя бы один нестрого возрастающий элемент, выходим из цикла
            }
        }

        // Выводим результат
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
