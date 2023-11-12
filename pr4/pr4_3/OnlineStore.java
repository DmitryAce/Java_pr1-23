package pr4.pr4_3;
import java.util.*;

// Класс интернет-магазина
class OnlineStore {
    private Map<Catalog, List<Product>> catalog = new HashMap<>();
    private List<User> users = new ArrayList<>();

    // Метод для добавления товара в каталог
    public void addToCatalog(Catalog category, Product product) {
        if (!catalog.containsKey(category)) {
            catalog.put(category, new ArrayList<>());
        }
        catalog.get(category).add(product);
    }

    // Метод для просмотра списка каталогов
    public void viewCatalog() {
        System.out.println("\nСписок каталогов:");
        for (Catalog category : catalog.keySet()) {
            System.out.println(category);
        }
    }

    // Метод для просмотра списка товаров в конкретном каталоге
    public void viewProductsInCatalog(Catalog category) {
        if (catalog.containsKey(category)) {
            System.out.println("\nТовары в каталоге " + category + ":");
            for (Product product : catalog.get(category)) {
                System.out.println(product.getName() + " - " + product.getPrice() + " $");
            }
        } else {
            System.out.println("Каталог " + category + " не существует.");
        }
    }

    // Метод для регистрации нового пользователя
    public void registerUser(User user) {
        users.add(user);
        System.out.println("Поздравляем с регистрацией!, " + user.getUsername());
    }

    // Метод для аутентификации пользователя
    public User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null; // Пользователь не найден
    }
}
