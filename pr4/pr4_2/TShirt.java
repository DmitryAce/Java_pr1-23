package pr4.pr4_2;

// Класс Футболка
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Мужчина одет в футболку.");
    }

    public void dressWomen() {
        System.out.println("Женщина одета в футболку.");
    }

    public void displayInfo() {
        System.out.println("Футболка: Размер - " + getSize() + ", Стоимость - " + getCost() + " $, Цвет - " + getColor());
    }
}
