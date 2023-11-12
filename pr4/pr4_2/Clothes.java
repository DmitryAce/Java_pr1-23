package pr4.pr4_2;

// ����������� ����� ������
abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public abstract void displayInfo();
}
/*
����������� ����� (abstract class) � Java - ��� �����, ������� ��������� � �������������� ��������� ����� abstract.
 ����������� ������ �� ����� ���� ��������������� ��������, �� ���� ������ ������� ������ ������������ ������.
 ��� ������������� ��� ����, ����� ������� � �������� ������� ������� ��� ������ ������� � ����� ��������� ����������� ������,
 ������� �� ����� ���������� � ����� ����������� ������.
 */