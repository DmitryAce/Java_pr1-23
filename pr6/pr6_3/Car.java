package pr6.pr6_3;

// ������ ������, ������������ ��������� Nameable (����������)
class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}