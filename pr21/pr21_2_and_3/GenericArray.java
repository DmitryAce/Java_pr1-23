package pr21.pr21_2_and_3;

// �������� ������� �� ��������� ���� ������

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        // �������������� ������ � �������� ��������
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        // ������������� �������� �� ���������� �������
        array[index] = value;
    }

    public T get(int index) {
        // �������� �������� �� �������
        return array[index];
    }

    public int length() {
        // ���������� ����� �������
        return array.length;
    }

    public static void main(String[] args) {
        // ������� ������ GenericArray, �������� ����� �����
        GenericArray<Integer> intArray = new GenericArray<>(5);

        // ������������� � �������� ��������
        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);

        System.out.println("Value at index 1: " + intArray.get(1));

        // ������� ������ GenericArray, �������� ������
        GenericArray<String> stringArray = new GenericArray<>(3);

        // ������������� � �������� ��������
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");

        System.out.println("Value at index 0: " + stringArray.get(0));
    }
}
