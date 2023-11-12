package pr4.pr4_4;

public class main {
    public static void main(String[] args) {
        // Создаем объекты для описания компьютера
        Processor processor = new Processor("Ryzen 5600X", 3.7);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("DIGMA", 27);

        // Создаем компьютер с маркой ASUS
        Computer computer1 = new Computer(ComputerBrand.CUSTOM, processor, memory, monitor);

        // Выводим информацию о компьютере
        System.out.println("Марка компьютера: " + computer1.getBrand());
        System.out.println("Процессор: " + computer1.getProcessor().getModel() + ", " + computer1.getProcessor().getClockSpeed() + " ГГц");
        System.out.println("Оперативная память: " + computer1.getMemory().getCapacityGB() + " ГБ, " + computer1.getMemory().getType());
        System.out.println("Монитор: " + computer1.getMonitor().getModel() + ", " + computer1.getMonitor().getSizeInInches() + " дюймов");

        // Обновляем оперативную память компьютера
        computer1.upgradeMemory(32, "DDR4");

        // Разгоняем процессор
        computer1.getProcessor().overclock(4.6);
    }
}
