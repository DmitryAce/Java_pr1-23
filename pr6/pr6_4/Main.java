package pr6.pr6_4;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1000.0);
        Priceable service = new Service("Plumbing", 50.0);

        System.out.println("Price of the product: $" + product.getPrice());
        System.out.println("Price of the service per hour: $" + service.getPrice());
    }
}