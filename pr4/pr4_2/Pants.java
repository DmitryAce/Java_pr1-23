package pr4.pr4_2;

// ����� �����
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }


    public void dressMan() {
        System.out.println("������� ���� � �����.");
    }


    public void dressWomen() {
        System.out.println("������� ����� � �����.");
    }


    public void displayInfo() {
        System.out.println("�����: ������ - " + getSize() + ", ��������� - " + getCost() + " $, ���� - " + getColor());
    }
}
