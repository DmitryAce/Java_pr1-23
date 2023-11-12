package pr3.pr3_5;

public class DoubleConversion {
    public static void main(String[] args) {
        // 1. ������� ������� ������ Double, ��������� ������ valueOf()
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("2.718");

        // 2. ����������� �������� ���� String � ���� double � ������� ������ Double.parseDouble()
        String strValue = "1.234";
        double doubleValue = Double.parseDouble(strValue);

        // 3. ����������� ������ ������ Double �� ���� ����������� �����
        double primitiveDouble = doubleObj1.doubleValue();
        float primitiveFloat = doubleObj1.floatValue();
        int primitiveInt = doubleObj1.intValue();
        long primitiveLong = doubleObj1.longValue();
        short primitiveShort = doubleObj1.shortValue();
        byte primitiveByte = doubleObj1.byteValue();

        // 4. ������� �������� �������� Double �� �������
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);

        // 5. ����������� ������� ���� double � ������ � ������� Double.toString()
        String d = Double.toString(3.14);

        // ������� �������� ������ �� �������
        System.out.println("d: " + d);
    }
}
