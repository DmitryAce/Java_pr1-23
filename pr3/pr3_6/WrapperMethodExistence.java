package pr3.pr3_6;
import java.lang.reflect.Method;

public class WrapperMethodExistence {
    public static void main(String[] args) {
        //  ласс-оболочка, дл€ которой мы хотим проверить наличие метода
        Class<?> wrapperClass = Integer.class;

        // »м€ метода, который мы хотим проверить
        String methodName = "parseInt";

        // ѕолучаем массив всех методов класса-оболочки
        Method[] methods = wrapperClass.getMethods();

        // ѕеребираем методы и провер€ем наличие метода с заданным именем
        boolean methodExists = false;
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                methodExists = true;
                break;
            }
        }

        // ¬ыводим результат
        if (methodExists) {
            System.out.println("ћетод " + methodName + " существует в классе-оболочке " + wrapperClass.getName());
        } else {
            System.out.println("ћетод " + methodName + " не существует в классе-оболочке " + wrapperClass.getName());
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