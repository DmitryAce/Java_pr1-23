package pr4.pr4_2;

// Класс Ателье
class Atelier {
    public static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                item.displayInfo();
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                item.displayInfo();
                ((WomenClothing) item).dressWomen();
            }
        }
    }
}