package pr13;

public class Task6 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        // Ищем позицию подстроки "Java" в строке
        int position = str.indexOf("Java");

        if (position != -1) {
            System.out.println("Подстрока 'Java' найдена в позиции: " + position);
        } else {
            System.out.println("Подстрока 'Java' не найдена в строке.");
        }
    }
}
