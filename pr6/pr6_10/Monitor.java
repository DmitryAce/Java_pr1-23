package pr6.pr6_10;

// ����� ��� �������� ��������
class Monitor {
    private double size; // inches

    public Monitor(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size + " inches";
    }
}