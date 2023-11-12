package pr2.pr2_4;
import java.util.ArrayList;
import java.util.List;

// ��������� ��� ���������� ��������� �����������
interface ComputerStore
{
    void addComputer(Computer computer);
    void removeComputer(String serialNumber);
    Computer findComputer(String serialNumber);
}

/*
��� ����������� ��� ������, ������� ���������� ����� �������, ������� ����� ������ �����������.
���������� ������������ ������ �������� ���������� ��� �������� � �� �����������,
��� �������������� ���������� ����� �������.
*/

// �����, �������������� ������� �����������
class Shop implements ComputerStore {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(String serialNumber) {
        computers.removeIf(computer -> computer.getSerialNumber().equals(serialNumber));
    }

    public Computer findComputer(String serialNumber) {
        for (Computer computer : computers) {
            if (computer.getSerialNumber().equals(serialNumber)) {
                return computer;
            }
        }
        return null; // ��������� � �������� �������� ������� �� ������
    }

    public List<Computer> getComputers() {
        return computers;
    }
}