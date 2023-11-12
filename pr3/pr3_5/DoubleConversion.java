package pr3.pr3_5;

public class DoubleConversion {
    public static void main(String[] args) {
        // 1. Создаем объекты класса Double, используя методы valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 2. Преобразуем значение типа String к типу double с помощью метода Double.parseDouble()
        String strValue = "1.234";
        double doubleValue = Double.parseDouble(strValue);

        // 3. Преобразуем объект класса Double ко всем примитивным типам
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        // 4. Выводим значение объектов Double на консоль
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);

        // 5. Преобразуем литерал типа double к строке с помощью Double.toString()
        String d = Double.toString(3.14);

        // Выводим значение строки на консоль
        System.out.println("d: " + d);
    }
}
