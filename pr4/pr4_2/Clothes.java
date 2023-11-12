package pr4.pr4_2;

// Абстрактный класс Одежда
abstract class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public abstract void displayInfo();
}
/*
Абстрактный класс (abstract class) в Java - это класс, который определен с использованием ключевого слова abstract.
 Абстрактные классы не могут быть инстанциированы напрямую, то есть нельзя создать объект абстрактного класса.
 Они предназначены для того, чтобы служить в качестве базовых классов для других классов и могут содержать абстрактные методы,
 которые не имеют реализации в самом абстрактном классе.
 */