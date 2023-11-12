package pr4.pr4_2;

// Класс Галстук
class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() {
        System.out.println("Мужчина одет в галстук.");
    }

    public void displayInfo() {
        System.out.println("Галстук: Размер - " + getSize() + ", Стоимость - " + getCost() + " $, Цвет - " + getColor());
    }
}
