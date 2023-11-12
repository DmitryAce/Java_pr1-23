package pr6.pr6_10;
import java.util.Scanner;

public class ComputerShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        while (true) {
            System.out.println("\n����:");
            System.out.println("1. �������� ���������");
            System.out.println("2. ������� ���������");
            System.out.println("3. ����� ��������� �� ������");
            System.out.println("4. ������� ������ ���� �����������");
            System.out.println("5. �����");
            System.out.print("�������� ��������: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // ��������� ������ ����� ������ ����� ������

            switch (choice) {
                case 1:
                    System.out.print("������� ����� ����������: ");
                    Brand brand = Brand.valueOf(scanner.nextLine());
                    System.out.print("������� ������ ����������: ");
                    String processorModel = scanner.nextLine();
                    System.out.print("������� ����� ������ (GB): ");
                    int memorySize = scanner.nextInt();
                    System.out.print("������� ������ �������� (inches): ");
                    double monitorSize = scanner.nextDouble();

                    Computer newComputer = new Computer(brand, new Processor(processorModel),
                            new Memory(memorySize), new Monitor(monitorSize));
                    shop.addComputer(newComputer);
                    System.out.println("��������� �������� � �������.");
                    break;

                case 2:
                    System.out.print("������� ����� ���������� ��� ��������: ");
                    Brand brandToRemove = Brand.valueOf(scanner.nextLine());
                    Computer computerToRemove = shop.findComputerByBrand(brandToRemove);
                    if (computerToRemove != null) {
                        shop.removeComputer(computerToRemove);
                        System.out.println("��������� ������ �� ��������.");
                    } else {
                        System.out.println("��������� � ��������� ������� �� ������.");
                    }
                    break;

                case 3:
                    System.out.print("������� ����� ���������� ��� ������: ");
                    Brand brandToFind = Brand.valueOf(scanner.nextLine());
                    Computer foundComputer = shop.findComputerByBrand(brandToFind);
                    if (foundComputer != null) {
                        System.out.println("������ ���������: " + foundComputer);
                    } else {
                        System.out.println("��������� � ��������� ������� �� ������.");
                    }
                    break;

                case 4:
                    System.out.println("������ ���� ����������� � ��������:");
                    shop.listAllComputers();
                    break;

                case 5:
                    System.out.println("����� �� ���������.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("�������� �����. ���������� �����.");
            }
        }
    }
}