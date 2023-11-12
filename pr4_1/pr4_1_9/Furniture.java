package pr4_1.pr4_1_9;

// Абстрактный класс, описывающий мебель
abstract class Furniture {
    private String name;
    private double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Абстрактный метод для вывода информации о мебели
    public abstract void displayInfo();
}

