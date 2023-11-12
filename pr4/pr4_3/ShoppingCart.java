package pr4.pr4_3;
import java.util.*;

// Класс для корзины покупателя
class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    // Метод для добавления товара в корзину
    public void addToCart(Product product) {
        items.add(product);
    }

    // Метод для вывода содержимого корзины и расчета общей стоимости
    public void viewCart() {
        double totalCost = 0.0;
        System.out.println("\nСодержимое корзины:");
        for (Product item : items) {
            System.out.println(item.getName() + " - " + item.getPrice() + " $");
            totalCost += item.getPrice();
        }
        System.out.println("Общая стоимость: " + totalCost + " $");
    }

    // Метод для очистки корзины после покупки
    public void checkout() {
        items.clear();
        System.out.println("Покупка успешно завершена. Корзина очищена.");
    }
}
