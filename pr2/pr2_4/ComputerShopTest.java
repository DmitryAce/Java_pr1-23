package pr2.pr2_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerShopTest {
    public static void main(String[] args) {
        Shop computerShop = new Shop();
        Scanner scanner = new Scanner(System.in);

        // Добавление компьютеров в магазин
        System.out.println("Введите информацию о компьютерах:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Серийный номер: ");
            String serialNumber = scanner.nextLine();
            System.out.print("Бренд: ");
            String brand = scanner.nextLine();
            System.out.print("Цена: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Очистка буфера

            Computer computer = new Computer(serialNumber, brand, price);
            computerShop.addComputer(computer);
        }

        // Поиск компьютера по серийному номеру
        System.out.print("Введите серийный номер компьютера для поиска: ");
        String searchSerialNumber = scanner.nextLine();
        Computer foundComputer = computerShop.findComputer(searchSerialNumber);
        if (foundComputer != null) {
            System.out.println("Найден компьютер: " + foundComputer);
        } else {
            System.out.println("Компьютер с указанным серийным номером не найден.");
        }

        scanner.close();
    }
}