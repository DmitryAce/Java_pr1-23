package pr4.pr4_4;

public class main {
    public static void main(String[] args) {
        // ������� ������� ��� �������� ����������
        Processor processor = new Processor("Ryzen 5600X", 3.7);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("DIGMA", 27);

        // ������� ��������� � ������ ASUS
        Computer computer1 = new Computer(ComputerBrand.CUSTOM, processor, memory, monitor);

        // ������� ���������� � ����������
        System.out.println("����� ����������: " + computer1.getBrand());
        System.out.println("���������: " + computer1.getProcessor().getModel() + ", " + computer1.getProcessor().getClockSpeed() + " ���");
        System.out.println("����������� ������: " + computer1.getMemory().getCapacityGB() + " ��, " + computer1.getMemory().getType());
        System.out.println("�������: " + computer1.getMonitor().getModel() + ", " + computer1.getMonitor().getSizeInInches() + " ������");

        // ��������� ����������� ������ ����������
        computer1.upgradeMemory(32, "DDR4");

        // ��������� ���������
        computer1.getProcessor().overclock(4.6);
    }
}
