package pr20.pr20_1;

public class MyGenericClass<T, V, K> {
    private T t;
    private V v;
    private K k;

    public MyGenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void printValues() {
        System.out.println("T: " + t);
        System.out.println("V: " + v);
        System.out.println("K: " + k);
    }

    public static void main(String[] args) {
        MyGenericClass<Integer, String, Double> myObject = new MyGenericClass<>(42, "Hello, World!", 3.14);
        myObject.printValues();
    }
}
