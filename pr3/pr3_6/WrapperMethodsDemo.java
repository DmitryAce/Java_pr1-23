package pr3.pr3_6;

public class WrapperMethodsDemo {
    public static void main(String[] args) {
        // Примеры использования методов классов-оболочек

        // Boolean
        Boolean boolObj = true;
        boolean boolPrimitive = boolObj.booleanValue(); // Преобразование в примитивный тип

        // Byte
        Byte byteObj = 123;
        byte bytePrimitive = byteObj.byteValue(); // Преобразование в примитивный тип

        // Character
        Character charObj = 'A';
        char charPrimitive = charObj.charValue(); // Преобразование в примитивный тип

        // Double
        Double doubleObj = 3.14;
        double doublePrimitive = doubleObj.doubleValue(); // Преобразование в примитивный тип

        // Float
        Float floatObj = 2.718f;
        float floatPrimitive = floatObj.floatValue(); // Преобразование в примитивный тип

        // Integer
        Integer intObj = 42;
        int intPrimitive = intObj.intValue(); // Преобразование в примитивный тип

        // Long
        Long longObj = 123456789L;
        long longPrimitive = longObj.longValue(); // Преобразование в примитивный тип

        // Short
        Short shortObj = 456;
        short shortPrimitive = shortObj.shortValue(); // Преобразование в примитивный тип

        // Методы для парсинга строк и преобразования чисел в строки
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("3.14");
        String intToString = Integer.toString(42);
        String doubleToString = Double.toString(3.14);

        // Выводим результаты
        System.out.println("Boolean: " + boolPrimitive);
        System.out.println("Byte: " + bytePrimitive);
        System.out.println("Character: " + charPrimitive);
        System.out.println("Double: " + doublePrimitive);
        System.out.println("Float: " + floatPrimitive);
        System.out.println("Integer: " + intPrimitive);
        System.out.println("Long: " + longPrimitive);
        System.out.println("Short: " + shortPrimitive);
        System.out.println("Parsed Int: " + parsedInt);
        System.out.println("Parsed Double: " + parsedDouble);
        System.out.println("Int to String: " + intToString);
        System.out.println("Double to String: " + doubleToString);
    }
}
