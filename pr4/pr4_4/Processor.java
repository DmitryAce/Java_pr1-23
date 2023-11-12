package pr4.pr4_4;

// ����� Processor ��� �������� ���������� ����������
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
            System.out.println("��������� ��� �������� �� " + clockSpeed + " ���.");
        } else {
            System.out.println("���������� ��������� ��������� �� ������ �������.");
        }
    }
}
