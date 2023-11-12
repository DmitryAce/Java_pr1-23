package pr4.pr4_3;

// Класс товара
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры для получения информации о товаре
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
