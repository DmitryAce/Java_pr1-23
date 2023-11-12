package pr6.pr6_3;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Earth");
        Nameable car = new Car("Toyota");

        System.out.println("Name of the planet: " + planet.getName());
        System.out.println("Name of the car: " + car.getName());
    }
}