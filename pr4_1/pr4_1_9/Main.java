package pr4_1.pr4_1_9;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();

        Chair chair = new Chair("���� �1", 100.0, 4);
        Table table = new Table("���� �1", 200.0, 6);
        Sofa sofa = new Sofa("����� �1", 500.0, 3);

        shop.addFurniture(chair);
        shop.addFurniture(table);
        shop.addFurniture(sofa);

        shop.displayInventory();
    }
}



