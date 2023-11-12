package pr4.pr4_3;

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        // ���������� ������� � ��������
        Product laptop = new Product("�������", 800.0);
        Product tShirt = new Product("��������", 20.0);
        Product book = new Product("�����", 15.0);
        Product pc = new Product("���������", 1450.0);

        store.addToCatalog(Catalog.ELECTRONICS, laptop);
        store.addToCatalog(Catalog.CLOTHING, tShirt);
        store.addToCatalog(Catalog.BOOKS, book);
        store.addToCatalog(Catalog.ELECTRONICS, pc);

        // ����������� �������������
        User user1 = new User("�������", "password1");
        User user2 = new User("���������", "password2");

        store.registerUser(user1);
        store.registerUser(user2);

        // �������������� ������������
        User authenticatedUser = store.authenticateUser("�������", "password1");
        if (authenticatedUser != null) {
            System.out.println("������������ " + authenticatedUser.getUsername() + " ������� �����.");
        } else {
            System.out.println("������ ��������������. �������� ��� ������������ ��� ������.");
        }

        // �������� ��������� � �������
        store.viewCatalog();

        store.viewProductsInCatalog(Catalog.ELECTRONICS);

        // ���������� ������� � ������� � �������
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(laptop);
        cart.addToCart(tShirt);
        cart.viewCart();

        System.out.println("\n���������� �������:");
        cart.checkout();
    }
}

