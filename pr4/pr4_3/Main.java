package pr4.pr4_3;

public class Main {
    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        // Добавление товаров в каталоги
        Product laptop = new Product("Ноутбук", 800.0);
        Product tShirt = new Product("Футболка", 20.0);
        Product book = new Product("Книга", 15.0);
        Product pc = new Product("Компьютер", 1450.0);

        store.addToCatalog(Catalog.ELECTRONICS, laptop);
        store.addToCatalog(Catalog.CLOTHING, tShirt);
        store.addToCatalog(Catalog.BOOKS, book);
        store.addToCatalog(Catalog.ELECTRONICS, pc);

        // Регистрация пользователей
        User user1 = new User("Дмитрий", "password1");
        User user2 = new User("Александр", "password2");

        store.registerUser(user1);
        store.registerUser(user2);

        // Аутентификация пользователя
        User authenticatedUser = store.authenticateUser("Дмитрий", "password1");
        if (authenticatedUser != null) {
            System.out.println("Пользователь " + authenticatedUser.getUsername() + " успешно вошел.");
        } else {
            System.out.println("Ошибка аутентификации. Неверное имя пользователя или пароль.");
        }

        // Просмотр каталогов и товаров
        store.viewCatalog();

        store.viewProductsInCatalog(Catalog.ELECTRONICS);

        // Добавление товаров в корзину и покупка
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(laptop);
        cart.addToCart(tShirt);
        cart.viewCart();

        System.out.println("\nОформление покупки:");
        cart.checkout();
    }
}

