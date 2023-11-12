package pr4_1.pr4_1_9;

// Класс стола, наследующийся от Furniture
class Table extends Furniture {
    private int numberOfSeats;

    public Table(String name, double price, int numberOfSeats) {
        super(name, price);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Количество мест: " + numberOfSeats);
    }
}