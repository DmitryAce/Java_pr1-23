package pr6.pr6_10;

// Класс для описания компьютера
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", Processor: " + processor + ", Memory: " + memory + ", Monitor: "
                + monitor + "]";
    }
}
