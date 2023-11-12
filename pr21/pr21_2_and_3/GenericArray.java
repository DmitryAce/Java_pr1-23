package pr21.pr21_2_and_3;

// Создание массива по заданному типу данных

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        // Инициализируем массив с заданным размером
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        // Устанавливаем значение по указанному индексу
        array[index] = value;
    }

    public T get(int index) {
        // Получаем значение по индексу
        return array[index];
    }

    public int length() {
        // Возвращаем длину массива
        return array.length;
    }

    public static void main(String[] args) {
        // Создаем объект GenericArray, хранящий целые числа
        GenericArray<Integer> intArray = new GenericArray<>(5);

        // Устанавливаем и получаем значения
        intArray.set(0, 1);
        intArray.set(1, 2);
        intArray.set(2, 3);

        System.out.println("Value at index 1: " + intArray.get(1));

        // Создаем объект GenericArray, хранящий строки
        GenericArray<String> stringArray = new GenericArray<>(3);

        // Устанавливаем и получаем значения
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");

        System.out.println("Value at index 0: " + stringArray.get(0));
    }
}
