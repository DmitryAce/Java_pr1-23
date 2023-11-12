package pr2.pr2_7;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        Book book1 = new Book("Эрих Мария Ремарк", "Три Товарища", 1990);
        Book book2 = new Book("Эрих Мария Ремарк", "Время жить и время умирать", 2005);
        Book book3 = new Book("Эрих Мария Ремарк", "Триумфальаня Арка", 1985);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("Последняя книга: " + bookshelf.getLatestBook());
        System.out.println("Самая раняя книга: " + bookshelf.getEarliestBook());

        bookshelf.sortByYear();
        System.out.println("\nКниг на полке (отсортированно по годам):");
        for (Book book : bookshelf.getBooks()) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
