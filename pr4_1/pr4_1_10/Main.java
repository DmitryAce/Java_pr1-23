package pr4_1.pr4_1_10;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Автомобиль", 100.0, 0.1);
        Transport airplane = new Airplane("Самолет", 900.0, 0.3);
        Transport train = new Train("Поезд", 120.0, 0.2);
        Transport ship = new Ship("Корабль", 50.0, 0.05);

        double distance = 500.0; // расстояние в километрах
        int numPassengers = 50; // количество пассажиров
        double cargoWeight = 1000.0; // вес груза в килограммах

        // Рассчитываем время и стоимость перевозки для каждого транспортного средства
        System.out.println(car.getName() + ":\nВремя: " + car.calculateTime(distance) + " часов");
        System.out.println("Стоимость пассажирской перевозки: " + car.calculatePassengerTransportCost(distance, numPassengers) + " руб.");
        System.out.println("Стоимость грузовой перевозки: " + car.calculateCargoTransportCost(distance, cargoWeight) + " руб.\n");

        System.out.println(airplane.getName() + ":\nВремя: " + airplane.calculateTime(distance) + " часов");
        System.out.println("Стоимость пассажирской перевозки: " + airplane.calculatePassengerTransportCost(distance, numPassengers) + " руб.");
        System.out.println("Стоимость грузовой перевозки: " + airplane.calculateCargoTransportCost(distance, cargoWeight) + " руб.\n");

        System.out.println(train.getName() + ":\nВремя: " + train.calculateTime(distance) + " часов");
        System.out.println("Стоимость пассажирской перевозки: " + train.calculatePassengerTransportCost(distance, numPassengers) + " руб.");
        System.out.println("Стоимость грузовой перевозки: " + train.calculateCargoTransportCost(distance, cargoWeight) + " руб.\n");

        System.out.println(ship.getName() + ":\nВремя: " + ship.calculateTime(distance) + " часов");
        System.out.println("Стоимость пассажирской перевозки: " + ship.calculatePassengerTransportCost(distance, numPassengers) + " руб.");
        System.out.println("Стоимость грузовой перевозки: " + ship.calculateCargoTransportCost(distance, cargoWeight) + " руб.");
    }
}
