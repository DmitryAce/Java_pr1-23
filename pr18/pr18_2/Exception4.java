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
            System.out.println("�������� ����");
        }
        finally {
            System.out.printf("��������� �����������");
        }
        //� Java �������� ����� finally ������������ ��� ����������� ����� ����, ������� ������ ���� �������� ����� ����� try-catch,
        // ���������� �� ����, ��������� ���������� ��� ���123.
        // ��� ��������, ��� ���� finally ������ �����������, ���� ���� � ����� try ��������� ����������123.
    }
}
