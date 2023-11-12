package pr6.pr6_10;

// Класс для описания процессора
class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}