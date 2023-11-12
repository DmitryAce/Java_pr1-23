package pr4.pr4_2;

// Класс Юбка
class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressWomen() {
        System.out.println("Женщина одета в юбку.");
    }

    public void displayInfo() {
        System.out.println("Юбка: Размер - " + getSize() + ", Стоимость - " + getCost() + " $, Цвет - " + getColor());
    }
}