package pr23.pr23_1;

public class Test {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " ����� �� �������\n");

        System.out.println("������ ������� " + queue.element());

        System.out.println("��������� ������� " + queue.rear());
        System.out.println("������ ������� " + queue.size());
        System.out.println("������� ������?  " + queue.isEmpty());
        System.out.println("������� ������?  " + queue.isFull());
        queue.enqueue(30);
        System.out.println("������� ������?  " + queue.isFull());
        queue.clear();
        System.out.println("������� ������?  " + queue.isEmpty());
    }
}
