package pr4_1.pr4_1_9;

// Класс стула, наследующийся от Furniture
class Chair extends Furniture {
    private int numberOfLegs;

    public Chair(String name, double price, int numberOfLegs) {
        super(name, price);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Количество ног: " + numberOfLegs);
    }
}
