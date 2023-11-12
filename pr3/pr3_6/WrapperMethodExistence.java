package pr3.pr3_6;
import java.lang.reflect.Method;

public class WrapperMethodExistence {
    public static void main(String[] args) {
        // �����-��������, ��� ������� �� ����� ��������� ������� ������
        Class<?> wrapperClass = Integer.class;

        // ��� ������, ������� �� ����� ���������
        String methodName = "parseInt";

        // �������� ������ ���� ������� ������-��������
        Method[] methods = wrapperClass.getMethods();

        // ���������� ������ � ��������� ������� ������ � �������� ������
        boolean methodExists = false;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                methodExists = true;
                break;
            }
        }

        // ������� ���������
        if (methodExists) {
            System.out.println("����� " + methodName + " ���������� � ������-�������� " + wrapperClass.getName());
        } else {
            System.out.println("����� " + methodName + " �� ���������� � ������-�������� " + wrapperClass.getName());
        }
    }
}

/*
+---------------------------+---------+---------+-----------+--------+-------+---------+--------+--------+-----------+
|                           | Boolean |   Byte  | Character | Double | Float | Integer |  Long  | Short  | isStatic  |
+---------------------------+---------+---------+-----------+--------+-------+---------+--------+--------+-----------+
| byteValue                 |    x    |   x     |           |    x   |   x   |     x   |    x   |   x    |           |
| doubleValue               |    x    |         |           |    x   |   x   |     x   |    x   |        |           |
| floatValue                |    x    |         |           |    x   |   x   |     x   |    x   |        |           |
| intValue                  |    x    |   x     |           |    x   |   x   |     x   |    x   |   x    |           |
| longValue                 |    x    |         |           |    x   |   x   |     x   |    x   |        |           |
| shortValue                |    x    |   x     |           |    x   |   x   |     x   |    x   |   x    |           |
| parseXxx                  |         |   x     |           |    x   |   x   |     x   |    x   |   x    |           |
| parseXxx with radix       |         |   x     |           |    x   |       |     x   |    x   |   x    |           |
| valueOf with radix        |         |   x     |           |        |       |     x   |    x   |   x    |           |
| toString(primitive)       |         |   x     |           |    x   |   x   |     x   |    x   |   x    |           |
| toString(primitive,radix) |         |   x     |           |    x   |       |     x   |    x   |   x    |           |
+---------------------------+---------+---------+-----------+--------+-------+---------+--------+--------+-----------+

*/