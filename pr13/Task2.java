package pr13;

public class Task2 {
    public static void main(String[] args) {
        String str = "Пример строки";

        // Получаем длину строки
        int length = str.length();

        // Проверяем, что строка не пуста
        if (length > 0) {
            // Индекс последнего символа равен длине строки минус 1
            char lastChar = str.charAt(length - 1);

            // Выводим последний символ на экран
            System.out.println("Последний символ строки: " + lastChar);
        } else {
            // Если строка пуста, выводим сообщение об этом
            System.out.println("Строка пуста, нельзя получить последний символ.");
        }
    }
}
