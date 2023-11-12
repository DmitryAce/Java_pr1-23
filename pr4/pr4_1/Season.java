package pr4.pr4_1;

public enum Season {
    SPRING("Весна", "Прохладное время года", 15),
    SUMMER("Лето", "Теплое время года", 25),
    AUTUMN("Осень", "Прохладное время года", 18),
    WINTER("Зима", "Холодное время года", 0);

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
            return "Теплое время года";
        }
        return description;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public static void printSeasonInfo(Season season) {
        System.out.println("Информация о времени года:");
        System.out.println("Название: " + season.getName());
        System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
        System.out.println("Описание: " + season.getDescription());
    }
}
