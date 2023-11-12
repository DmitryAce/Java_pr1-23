package pr4.pr4_1;

public enum Season {
    SPRING("�����", "���������� ����� ����", 15),
    SUMMER("����", "������ ����� ����", 25),
    AUTUMN("�����", "���������� ����� ����", 18),
    WINTER("����", "�������� ����� ����", 0);

    private String name;
    private String description;
    private int averageTemperature;

    Season(String name, String description, int averageTemperature) {
        this.name = name;
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        if (this == SUMMER) {
            return "������ ����� ����";
        }
        return description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void printSeasonInfo(Season season) {
        System.out.println("���������� � ������� ����:");
        System.out.println("��������: " + season.getName());
        System.out.println("������� �����������: " + season.getAverageTemperature() + "�C");
        System.out.println("��������: " + season.getDescription());
    }
}
