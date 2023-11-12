package pr4_1.pr4_1_10;

// Абстрактный класс, описывающий Транспортное средство
abstract class Transport {
    private String name;
    private double speed; // в км/ч
    private double costPerKm; // стоимость за километр

    public Transport(String name, double speed, double costPerKm) {
        this.name = name;
        this.speed = speed;
        this.costPerKm = costPerKm;
    }

    public String getName(){
        return name;
    }

    public double getSpeed(){
        return speed;
    }

    public double getCostPerKm(){
        return costPerKm;
    }

    public abstract double calculateTime(double distance);

    public abstract double calculatePassengerTransportCost(double distance, int numPassengers);

    public abstract double calculateCargoTransportCost(double distance, double cargoWeight);
}
