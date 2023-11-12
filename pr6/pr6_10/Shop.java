package pr6.pr6_10;
import java.util.ArrayList;

// Класс для магазина компьютеров
class Shop {
    private ArrayList<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    // Метод для поиска компьютера по бренду
    public Computer findComputerByBrand(Brand brand) {
        for (Computer computer : computers) {
            if (computer.toString().contains(brand.toString())) {
                return computer;
            }
        }
        return null;
    }

    // Метод для вывода всех компьютеров в магазине
    public void listAllComputers() {
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }
}