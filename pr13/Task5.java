package pr13;

public class Task5 {
    public static void main(String[] args) {
        String str = "Пример строки, содержащей слово Java";

        // Проверяем, содержит ли строка подстроку "Java"
        boolean containsJava = str.contains("Java");

        if (containsJava) {
            System.out.println("Строка содержит подстроку 'Java'.");
        } else {
            System.out.println("Строка не содержит подстроку 'Java'.");
        }
    }
}
