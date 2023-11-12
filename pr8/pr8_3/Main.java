package pr8.pr8_3;

public class Main {
    public static void main(String[] args) {
        int n = 211; // Замените на ваше натуральное число

        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Рекурсивная функция для проверки числа на простоту
    // current - текущий делитель, начиная с 2
    public static boolean isPrime(int n, int current) {
        if (n <= 1) {
            return false; // Число меньше или равно 1 не является простым
        }

        if (current * current > n) {
            return true; // Делителей больше не найдено, число простое
        }

        if (n % current == 0) {
            return false; // Найден делитель, число составное
        }

        // Рекурсивно вызываем функцию для следующего делителя
        return isPrime(n, current + 1);
    }
}
