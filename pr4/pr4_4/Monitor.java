package pr4.pr4_4;

// ����� Monitor ��� �������� �������� ����������
class Monitor {
    private String model;
    private int sizeInInches;

    public Monitor(String model, int sizeInInches) {
        this.model = model;
        this.sizeInInches = sizeInInches;
    }

    public String getModel() {
        return model;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }
}

