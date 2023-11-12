package pr4_1.pr4_1_9;

// Класс дивана, наследующийся от Furniture
class Sofa extends Furniture {
    private int seatingCapacity;

    public Sofa(String name, double price, int seatingCapacity) {
        super(name, price);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Диван: " + getName());
        System.out.println("Цена: " + getPrice() + " руб.");
        System.out.println("Вместимость: " + seatingCapacity + " человек");
    }
}