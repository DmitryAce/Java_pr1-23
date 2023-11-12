package pr4_1.pr4_1_9;
import java.util.*;

// Класс магазина мебели
class FurnitureShop {
    private List<Furniture> inventory;

    public FurnitureShop() {
        inventory = new ArrayList<>();
    }

    // Добавить мебель в инвентарь магазина
    public void addFurniture(Furniture furniture) {
        inventory.add(furniture);
    }

    // Вывести информацию о всей мебели в магазине
    public void displayInventory() {
        System.out.println("Инвентарь магазина мебели:");
        for (Furniture furniture : inventory) {
            furniture.displayInfo();
            System.out.println("-------------------------");
        }
    }
}