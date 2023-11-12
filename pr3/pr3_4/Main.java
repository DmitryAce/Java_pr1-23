package pr3.pr3_4;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя размер массива
        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Введите корректное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Создаем массив из n случайных целых чисел в диапазоне [0; n]
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        // Выводим исходный массив на экран
        System.out.println("Исходный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Переходим на новую строку

        // Создаем второй массив из четных элементов первого массива
        int[] evenArray = new int[n]; // Предполагаем, что весь массив будет заполнен нулями
        int evenCount = 0; // Счетчик четных элементов
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            }
        }

        // Выводим второй массив на экран
        System.out.println("Второй массив (четные элементы):");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}
