package pr8.pr8_2;

public class Main {
    public static void main(String[] args) {
        int N = 12345; // Замените на ваше натуральное число
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    // Рекурсивная функция для вычисления суммы цифр числа
    public static int sumOfDigits(int N) {
        if (N == 0) {
            // Базовый случай: если число равно 0, возвращаем 0
            return 0;
        } else {
            // Рекурсивно вызываем функцию для оставшихся цифр числа
            int lastDigit = N % 10; // Получаем последнюю цифру числа
            int remainingDigits = N / 10; // Получаем число без последней цифры
            return lastDigit + sumOfDigits(remainingDigits);
        }
    }
}
