package pr4_1.pr4_1_9;
import java.util.*;

// ����� �������� ������
class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    // �������� ������ � ��������� ��������
    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    // ������� ���������� � ���� ������ � ��������
    public void displayInventory() {
        System.out.println("��������� �������� ������:");
        for (Furniture furniture : inventory) {
            furniture.displayInfo();
            System.out.println("-------------------------");
        }
    }
}