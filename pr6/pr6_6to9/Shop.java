package pr6.pr6_6to9;

// ����� Shop, ����������� ��������� Printable
class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Shop: " + name);
    }
}