package pr6.pr6_10;

// Класс для описания монитора
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