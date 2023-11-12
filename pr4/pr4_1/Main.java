package pr4.pr4_1;

public class Main {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("��� ������� ����� ����:");
        Season.printSeasonInfo(myFavoriteSeason);

        System.out.println("\n�������� ������ ����:");
        for (Season season : Season.values()) {
            System.out.println("��������: " + season.getName());
            System.out.println("������� �����������: " + season.getAverageTemperature() + "�C");
            System.out.println("��������: " + season.getDescription() + "\n");
        }
    }
}