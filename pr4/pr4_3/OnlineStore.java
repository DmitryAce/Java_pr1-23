package pr4.pr4_3;
import java.util.*;

// ����� ��������-��������
class OnlineStore {
    private Map<Catalog, List<Product>> catalog = new HashMap<>();
    private List<User> users = new ArrayList<>();

    // ����� ��� ���������� ������ � �������
    public void addToCatalog(Catalog category, Product product) {
        if (!catalog.containsKey(category)) {
            catalog.put(category, new ArrayList<>());
        }
        catalog.get(category).add(product);
    }

    // ����� ��� ��������� ������ ���������
    public void viewCatalog() {
        System.out.println("\n������ ���������:");
        for (Catalog category : catalog.keySet()) {
            System.out.println(category);
        }
    }

    // ����� ��� ��������� ������ ������� � ���������� ��������
    public void viewProductsInCatalog(Catalog category) {
        if (catalog.containsKey(category)) {
            System.out.println("\n������ � �������� " + category + ":");
            for (Product product : catalog.get(category)) {
                System.out.println(product.getName() + " - " + product.getPrice() + " $");
            }
        } else {
            System.out.println("������� " + category + " �� ����������.");
        }
    }

    // ����� ��� ����������� ������ ������������
    public void registerUser(User user) {
        users.add(user);
        System.out.println("����������� � ������������!, " + user.getUsername());
    }

    // ����� ��� �������������� ������������
    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // ������������ �� ������
    }
}
