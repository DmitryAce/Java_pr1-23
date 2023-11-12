package pr4.pr4_1;

public class Main {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года:");
        Season.printSeasonInfo(myFavoriteSeason);

        System.out.println("\nОписание времен года:");
        for (Season season : Season.values()) {
            System.out.println("Название: " + season.getName());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание: " + season.getDescription() + "\n");
        }
    }
}