package pr4.pr4_3;
import java.util.*;

// ����� ��� ������� ����������
class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    // ����� ��� ���������� ������ � �������
    public void addToCart(Product product) {
        items.add(product);
    }

    // ����� ��� ������ ����������� ������� � ������� ����� ���������
    public void viewCart() {
        double totalCost = 0.0;
        System.out.println("\n���������� �������:");
        for (Product item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " $");
            totalCost += item.getPrice();
        }
        System.out.println("����� ���������: " + totalCost + " $");
    }

    // ����� ��� ������� ������� ����� �������
    public void checkout() {
        items.clear();
        System.out.println("������� ������� ���������. ������� �������.");
    }
}
