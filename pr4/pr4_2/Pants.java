package pr4.pr4_2;

// Класс Штаны
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }


    public void dressMan() {
        System.out.println("Мужчина одет в штаны.");
    }


    public void dressWomen() {
        System.out.println("Женщина одета в штаны.");
    }


    public void displayInfo() {
        System.out.println("Штаны: Размер - " + getSize() + ", Стоимость - " + getCost() + " $, Цвет - " + getColor());
    }
}
