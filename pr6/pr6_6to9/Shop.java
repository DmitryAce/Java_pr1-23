package pr6.pr6_6to9;

// Класс Shop, реализующий интерфейс Printable
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