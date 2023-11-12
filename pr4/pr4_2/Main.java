package pr4.pr4_2;

public class Main {
    public static void main(String[] args) {
        Clothes[] allClothes = {
                new TShirt(Size.M, 25.0, "Синяя"),
                new Pants(Size.L, 40.0, "Черные"),
                new Skirt(Size.S, 30.0, "Красная"),
                new Tie(Size.XXS, 15.0, "Синий")
        };

        //Atelier.dressMan(allClothes);
        Atelier.dressWomen(allClothes);
    }
}
