package pr6.pr6_3;

// ������ ������, ������������ ��������� Nameable (�������)
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}