package pr3.pr3_6;

public class WrapperMethodsDemo {
    public static void main(String[] args) {
        // ������� ������������� ������� �������-��������

        // Boolean
        Boolean boolObj = true;
        boolean boolPrimitive = boolObj.booleanValue(); // �������������� � ����������� ���

        // Byte
        Byte byteObj = 123;
        byte bytePrimitive = byteObj.byteValue(); // �������������� � ����������� ���

        // Character
        Character charObj = 'A';
        char charPrimitive = charObj.charValue(); // �������������� � ����������� ���

        // Double
        Double doubleObj = 3.14;
        double doublePrimitive = doubleObj.doubleValue(); // �������������� � ����������� ���

        // Float
        Float floatObj = 2.718f;
        float floatPrimitive = floatObj.floatValue(); // �������������� � ����������� ���

        // Integer
        Integer intObj = 42;
        int intPrimitive = intObj.intValue(); // �������������� � ����������� ���

        // Long
        Long longObj = 123456789L;
        long longPrimitive = longObj.longValue(); // �������������� � ����������� ���

        // Short
        Short shortObj = 456;
        short shortPrimitive = shortObj.shortValue(); // �������������� � ����������� ���

        // ������ ��� �������� ����� � �������������� ����� � ������
        int parsedInt = Integer.parseInt("123");
        double parsedDouble = Double.parseDouble("3.14");
        String intToString = Integer.toString(42);
        String doubleToString = Double.toString(3.14);

        // ������� ����������
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
