package pr4.pr4_2;

// ����� ����
class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressWomen() {
        System.out.println("������� ����� � ����.");
    }

    public void displayInfo() {
        System.out.println("����: ������ - " + getSize() + ", ��������� - " + getCost() + " $, ���� - " + getColor());
    }
}