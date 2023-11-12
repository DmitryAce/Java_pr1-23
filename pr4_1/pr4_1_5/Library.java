package pr4_1.pr4_1_5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Информатика", "01.01.1990", "+123456789");
        Reader reader2 = new Reader("Иванов И. И.", 54321, "Физика", "15.05.1985", "+987654321");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader1.takeBook(3);
        reader2.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader2.returnBook("Приключения", "Энциклопедия");
        reader2.returnBook(book2);
    }
}