package pr2.pr2_4;

public class Computer {
    private String serialNumber;
    private String brand;
    private double price;

    public Computer(String serialNumber, String brand, double price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "Computer [Серийный номер=" + serialNumber + ", Бренд=" + brand + ", Цена=" + price + "]";
    }
}
