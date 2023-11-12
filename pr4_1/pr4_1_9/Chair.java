package pr4_1.pr4_1_9;

// ����� �����, ������������� �� Furniture
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("����: " + getName());
        System.out.println("����: " + getPrice() + " ���.");
        System.out.println("���������� ���: " + numberOfLegs);
    }
}
