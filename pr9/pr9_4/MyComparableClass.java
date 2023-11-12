package pr9.pr9_4;

public class MyComparableClass {
    private int value;

    public MyComparableClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(MyComparableClass other) {
        // Сравниваем объекты по полю value
        if (this.value < other.value) {
            return -1;
        } else if (this.value > other.value) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        MyComparableClass obj1 = new MyComparableClass(10);
        MyComparableClass obj2 = new MyComparableClass(5);

        int result = obj1.compareTo(obj2);

        if (result < 0) {
            System.out.println("obj1 is less than obj2");
        } else if (result > 0) {
            System.out.println("obj1 is greater than obj2");
        } else {
            System.out.println("obj1 is equal to obj2");
        }
    }
}
