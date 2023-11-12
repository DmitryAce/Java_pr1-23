package pr4.pr4_2;

// ����� ������
class Atelier {
    public static void dressMan(Clothes[] clothes) {
        System.out.println("������� ������:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                item.displayInfo();
                ((MenClothing) item).dressMan();
            }
        }
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("������� ������:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                item.displayInfo();
                ((WomenClothing) item).dressWomen();
            }
        }
    }
}