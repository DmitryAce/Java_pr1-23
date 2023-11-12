package pr2.pr2_7;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(5);

        Book book1 = new Book("���� ����� ������", "��� ��������", 1990);
        Book book2 = new Book("���� ����� ������", "����� ���� � ����� �������", 2005);
        Book book3 = new Book("���� ����� ������", "������������ ����", 1985);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        System.out.println("��������� �����: " + bookshelf.getLatestBook());
        System.out.println("����� ����� �����: " + bookshelf.getEarliestBook());

        bookshelf.sortByYear();
        System.out.println("\n���� �� ����� (�������������� �� �����):");
        for (Book book : bookshelf.getBooks()) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }
}
