import pr2.pr2_1.Author;

public class Main {
    public static void main(String[] args)
    {
        Author author = new Author("ִלטענטי", "dm1tryace@yandex.ru", 'M');
        System.out.printf("Hello and welcome!\n");
        String name = author.getName();
        System.out.printf(name);
    }
}