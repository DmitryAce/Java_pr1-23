package pr4_1.pr4_1_5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("������ �. �.", 12345, "�����������", "01.01.1990", "+123456789");
        Reader reader2 = new Reader("������ �. �.", 54321, "������", "15.05.1985", "+987654321");

        Book book1 = new Book("�����������", "�����1");
        Book book2 = new Book("�������", "�����2");
        Book book3 = new Book("������������", "�����3");

        reader1.takeBook(3);
        reader2.takeBook("�����������", "�������", "������������");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(2);
        reader2.returnBook("�����������", "������������");
        reader2.returnBook(book2);
    }
}