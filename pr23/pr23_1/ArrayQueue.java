package pr23.pr23_1;
public class ArrayQueue {
    private int front, rear, size;
    private int capacity;
    private int array[];

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        front = this.size = 0;
        rear = capacity - 1;
        array = new int[this.capacity];
    }

    // ������� �����, ����� ������ ����� 0
    public boolean isEmpty() {
        return (this.size == 0);
    }

    // ������� �����, ����� ������ ����� ������������ �����������
    public boolean isFull() {
        return (this.size == this.capacity);
    }

    public int size() {
        return this.size;
    }

    // ����� ��� ���������� �������� � �������.
    // �������� rear � size
    public void enqueue(int item) {
        if (isFull())
            return;
        this.rear = (this.rear + 1) % this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
    }

    // ����� ��� �������� �������� �� �������.
    // �������� front � size
    public int dequeue() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // ����� ��� ��������� front �������� �������.
    public int element() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return this.array[this.front];
    }

    // ����� ��� ��������� rear �������� �������.
    public int rear() {
        if (isEmpty())
            return Integer.MIN_VALUE;

        return this.array[this.rear];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[(front + i) % capacity] = 0;
        }
        front = 0;
        size = 0;
        rear = capacity - 1;
    }

}
