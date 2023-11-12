package pr2.pr2_4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerShopTest {
    public static void main(String[] args) {
        Shop computerShop = new Shop();
        Scanner scanner = new Scanner(System.in);

        // ���������� ����������� � �������
        System.out.println("������� ���������� � �����������:");
        for (int i = 0; i < 3; i++) {
            System.out.print("�������� �����: ");
            String serialNumber = scanner.nextLine();
            System.out.print("�����: ");
            String brand = scanner.nextLine();
            System.out.print("����: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // ������� ������

            Computer computer = new Computer(serialNumber, brand, price);
            computerShop.addComputer(computer);
        }

        // ����� ���������� �� ��������� ������
        System.out.print("������� �������� ����� ���������� ��� ������: ");
        String searchSerialNumber = scanner.nextLine();
        Computer foundComputer = computerShop.findComputer(searchSerialNumber);
        if (foundComputer != null) {
            System.out.println("������ ���������: " + foundComputer);
        } else {
            System.out.println("��������� � ��������� �������� ������� �� ������.");
        }

        scanner.close();
    }
}