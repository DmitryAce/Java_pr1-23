package pr4_1.pr4_1_5;

public class Reader {
    private String fullName;
    private int ticketNumber;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " ���� " + numberOfBooks + " �����");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " ���� �����: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " ���� �����: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " ������ " + numberOfBooks + " �����");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " ������ �����: ");
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " ������ �����: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
