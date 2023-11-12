package pr6.pr6_3;

// Пример класса, реализующего интерфейс Nameable (Планета)
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}