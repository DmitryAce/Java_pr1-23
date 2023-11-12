package pr23.pr23_1;

public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " удалён из очереди\n");

        System.out.println("Первый элемент " + queue.element());

        System.out.println("Последний элемент " + queue.rear());
        System.out.println("Размер очереди " + queue.size());
        System.out.println("Очередь пустая?  " + queue.isEmpty());
        System.out.println("Очередь полная?  " + queue.isFull());
        queue.enqueue(30);
        System.out.println("Очередь полная?  " + queue.isFull());
        queue.clear();
        System.out.println("Очередь пустая?  " + queue.isEmpty());
    }
}
