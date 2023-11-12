package pr2.pr2_4;
import java.util.ArrayList;
import java.util.List;

// Интерфейс для управления магазином компьютеров
interface ComputerStore
{
    void addComputer(Computer computer);
    void removeComputer(String serialNumber);
    Computer findComputer(String serialNumber);
}

/*
это абстрактный тип данных, который определяет набор методов, которые класс должен реализовать.
Интерфейсы обеспечивают способ создания абстракции над методами и их сигнатурами,
без предоставления реализации самих методов.
*/

// Класс, представляющий магазин компьютеров
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
        return null; // Компьютер с заданным серийным номером не найден
    }

    public List<Computer> getComputers() {
        return computers;
    }
}