package pr6.pr6_10;

// Класс для описания оперативной памяти
class Memory {
    private int size; // GB

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size + "GB";
    }
}