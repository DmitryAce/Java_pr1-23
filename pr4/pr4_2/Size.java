package pr4.pr4_2;

// ������������ � ��������� ������
enum Size {
    XXS("������� ������", 32),
    XS("�������� ������", 34),
    S("�������� ������", 36),
    M("�������� ������", 38),
    L("�������� ������", 40);

    private String description;
    private int euroSize;

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }
}