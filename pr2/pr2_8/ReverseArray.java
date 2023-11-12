package pr2.pr2_8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};

        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

        // Вывод массива после обмена элементов
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}

