package pr18.pr18_2;
import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo()
    {
        String intString = "";
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный ввод");
        }
        finally {
            System.out.printf("Программа завершилась");
        }
        //В Java ключевое слово finally используется для определения блока кода, который должен быть выполнен после блока try-catch,
        // независимо от того, произошло исключение или нет123.
        // Это означает, что блок finally всегда выполняется, даже если в блоке try произошло исключение123.
    }
}
