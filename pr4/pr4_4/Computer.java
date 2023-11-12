package pr4.pr4_4;

// Класс Computer для описания компьютера
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void upgradeMemory(int newCapacityGB, String newType) {
        memory = new Memory(newCapacityGB, newType);
        System.out.println("Обновлена оперативная память: " + memory.getCapacityGB() + " ГБ, " + memory.getType());
    }
}
