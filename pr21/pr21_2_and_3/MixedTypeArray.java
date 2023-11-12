package pr21.pr21_2_and_3;

public class MixedTypeArray {
    private Object[] array;

    public MixedTypeArray(int size) {
        array = new Object[size];
    }

    public void set(int index, Object value) {
        array[index] = value;
    }

    public Object get(int index) {
        return array[index];
    }

    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        MixedTypeArray mixedArray = new MixedTypeArray(5);

        mixedArray.set(0, 42);
        mixedArray.set(1, "Hello");
        mixedArray.set(2, 3.14);

        for (int i = 0; i < mixedArray.length(); i++) {
            System.out.println("Value at index " + i + ": " + mixedArray.get(i));
        }
    }
}
