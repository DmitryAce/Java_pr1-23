package practice.pr1;
import java.util.Scanner;

public class pr1 {
    public static void main(String[] args)
    {
        task5.main(args);
    }

    public static class task1
    {
        public static void main(String[] args)
        {

            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int i = 0; i < numbers.length; i++)
            {
                sum += numbers[i];
            }
            double average = (double) sum / numbers.length;
            System.out.println("Сумма элементов массива: " + sum);
            System.out.println("Среднее арифметическое элементов массива: " + average);
        }
    }

    public static class task2
    {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            int sum = 0;
            int i = 0;
            do {
                sum += numbers[i];
                i++;
            } while (i < size);
            System.out.println("Сумма элементов массива: " + sum);
            int max = numbers[0];
            int min = numbers[0];
            i = 1;
            while (i < size) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                i++;
            }
            System.out.println("Максимальный элемент в массиве: " + max);
            System.out.println("Минимальный элемент в массиве: " + min);
        }
    }

    public static class task3
    {
        public static void main(String[] args)
        {
            for (int i = 0; i < args.length; i++)
            {
                System.out.println(args[i]);
            }
        }
    }

    public static class task4
    {
        public static void main(String[] args)
        {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%.2f ", 1.0 / i);
            }
            System.out.println();
        }
    }

    public static class task5
    {
        public static void main(String[] args)
        {
            int n = 5;
            int result = factorial(n);
            System.out.println("Факториал числа " + n + " равен " + result);
        }
    }

    public static int factorial(int n)
    {
        int result = 1;
        for (int i = 1; i <= n; i++)
        {
            result *= i;
        }
        return result;
    }
}
