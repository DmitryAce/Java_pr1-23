package pr4.pr4_2;

// ����� �������
class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("������� ���� � �������.");
    }

    public void displayInfo() {
        System.out.println("�������: ������ - " + getSize() + ", ��������� - " + getCost() + " $, ���� - " + getColor());
    }
}
