package pr4_1.pr4_1_9;

// ����� �����, ������������� �� Furniture
class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("����: " + getName());
        System.out.println("����: " + getPrice() + " ���.");
        System.out.println("���������� ����: " + numberOfSeats);
    }
}