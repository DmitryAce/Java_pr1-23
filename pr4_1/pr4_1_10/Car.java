package pr4_1.pr4_1_10;

// Подкласс Автомобиль
class Car extends Transport {
    public Car(String name, double speed, double costPerKm) {
        super(name, speed, costPerKm);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / getSpeed();
    }

    @Override
    public double calculatePassengerTransportCost(double distance, int numPassengers) {
        return distance * getCostPerKm() * numPassengers;
    }

    @Override
    public double calculateCargoTransportCost(double distance, double cargoWeight) {
        return distance * getCostPerKm() * cargoWeight;
    }
}