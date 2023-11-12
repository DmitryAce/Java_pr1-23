package pr4.pr4_4;

// Класс Processor для описания процессора компьютера
class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void overclock(double newClockSpeed) {
        if (newClockSpeed > clockSpeed) {
            clockSpeed = newClockSpeed;
            System.out.println("Процессор был разогнан до " + clockSpeed + " ГГц.");
        } else {
            System.out.println("Невозможно разогнать процессор до данной частоты.");
        }
    }
}
