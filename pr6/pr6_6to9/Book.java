package pr6.pr6_6to9;

// ����� Book, ����������� ��������� Printable
class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }
}