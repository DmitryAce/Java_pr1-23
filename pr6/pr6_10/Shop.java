package pr6.pr6_10;
import java.util.ArrayList;

// ����� ��� �������� �����������
class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    // ����� ��� ���������� ���������� � �������
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // ����� ��� �������� ���������� �� ��������
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // ����� ��� ������ ���������� �� ������
    public Computer findComputerByBrand(Brand brand) {
        for (Computer computer : computers) {
            if (computer.toString().contains(brand.toString())) {
                return computer;
            }
        }
        return null;
    }

    // ����� ��� ������ ���� ����������� � ��������
    public void listAllComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}