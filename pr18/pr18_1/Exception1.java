package pr18.pr18_1;

public class Exception1 {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Поделил на ноль?");
        }
    }
}