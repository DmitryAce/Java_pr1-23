package pr6.pr6_10;
import java.util.Scanner;

public class ComputerShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Удалить компьютер");
            System.out.println("3. Найти компьютер по бренду");
            System.out.println("4. Вывести список всех компьютеров");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после выбора

            switch (choice) {
                case 1:
                    System.out.print("Введите бренд компьютера: ");
                    Brand brand = Brand.valueOf(scanner.nextLine());
                    System.out.print("Введите модель процессора: ");
                    String processorModel = scanner.nextLine();
                    System.out.print("Введите объем памяти (GB): ");
                    int memorySize = scanner.nextInt();
                    System.out.print("Введите размер монитора (inches): ");
                    double monitorSize = scanner.nextDouble();

                    Computer newComputer = new Computer(brand, new Processor(processorModel),
                            new Memory(memorySize), new Monitor(monitorSize));
                    shop.addComputer(newComputer);
                    System.out.println("Компьютер добавлен в магазин.");
                    break;

                case 2:
                    System.out.print("Введите бренд компьютера для удаления: ");
                    Brand brandToRemove = Brand.valueOf(scanner.nextLine());
                    Computer computerToRemove = shop.findComputerByBrand(brandToRemove);
                    if (computerToRemove != null) {
                        shop.removeComputer(computerToRemove);
                        System.out.println("Компьютер удален из магазина.");
                    } else {
                        System.out.println("Компьютер с указанным брендом не найден.");
                    }
                    break;

                case 3:
                    System.out.print("Введите бренд компьютера для поиска: ");
                    Brand brandToFind = Brand.valueOf(scanner.nextLine());
                    Computer foundComputer = shop.findComputerByBrand(brandToFind);
                    if (foundComputer != null) {
                        System.out.println("Найден компьютер: " + foundComputer);
                    } else {
                        System.out.println("Компьютер с указанным брендом не найден.");
                    }
                    break;

                case 4:
                    System.out.println("Список всех компьютеров в магазине:");
                    shop.listAllComputers();
                    break;

                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}