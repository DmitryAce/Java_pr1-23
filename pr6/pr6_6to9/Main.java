package pr6.pr6_6to9;

public class Main {
    public static void main(String[] args) {
        // Создаем массив объектов типа Printable
        Printable[] printableItems = new Printable[5];
        printableItems[0] = new Book("Zeit zu leben und Zeit zu sterben");
        printableItems[1] = new Book("Drei Kameraden");
        printableItems[2] = new Book("Arc de Triomphe");
        printableItems[3] = new Book("Im Westen nichts Neues");
        printableItems[4] = new Shop("Online Remark Bookstore");

        // Проходим по массиву и вызываем метод print() для каждого объекта
        for (Printable item : printableItems) {
            item.print();
        }
    }
}