package pr8.pr8_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество цифр (k): ");
        int k = scanner.nextInt();

        System.out.print("Введите сумму цифр (s): ");
        int s = scanner.nextInt();

        int count = countNumbersWithSum(k, s);
        System.out.println("Количество чисел: " + count);
    }

    // Функция для подсчета количества k-значных чисел с суммой цифр s
    public static int countNumbersWithSum(int k, int s) {
        if (s < 1 || s > 9 * k) {
            // Если сумма невозможна для k-значных чисел, возвращаем 0
            return 0;
        }

        // Используем рекурсивную функцию для подсчета
        return countNumbersWithSumHelper(k, s, 1, "");
    }

    // Вспомогательная рекурсивная функция для подсчета
    private static int countNumbersWithSumHelper(int k, int s, int startDigit, String currentNumber) {
        if (k == 0) {
            // Если осталось нулевое количество цифр, проверяем сумму
            if (s == 0) {
                // Если сумма совпадает, то число подходит
                System.out.println(currentNumber); // Вывод числа для отладки
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;

        for (int digit = startDigit; digit <= 9; digit++) {
            if (s - digit >= 0) {
                // Рекурсивно вызываем функцию для оставшихся цифр
                count += countNumbersWithSumHelper(k - 1, s - digit, 0, currentNumber + digit);
            }
        }

        return count;
    }
}
