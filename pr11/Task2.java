package pr11;

import java.util.Scanner;
import java.util.Calendar;

public class Task2 {
    public static void main(String[] args)
    {
        long system = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Calendar mytime = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        int year1 = calendar.get(Calendar.YEAR);
        int month1 = calendar.get(Calendar.MONTH);
        int day1 = calendar.get(Calendar.DAY_OF_MONTH);
        int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
        int minute1 = calendar.get(Calendar.MINUTE);
        int second1 = calendar.get(Calendar.SECOND);

        System.out.println("������� ���:");
        int year2 = scanner.nextInt();
        mytime.set(Calendar.YEAR,year2);
        System.out.println("������� �����:");
        int month2 = scanner.nextInt();
        mytime.set(Calendar.MONTH,month2);
        System.out.println("������� ����:");
        int day2 = scanner.nextInt();
        mytime.set(Calendar.DAY_OF_MONTH,day2);
        System.out.println("������� ���:");
        int hour2 = scanner.nextInt();
        mytime.set(Calendar.HOUR_OF_DAY,hour2);
        System.out.println("������� ������:");
        int minute2 = scanner.nextInt();
        mytime.set(Calendar.MINUTE,minute2);
        System.out.println("������� �������:");
        int second2 = scanner.nextInt();
        mytime.set(Calendar.SECOND,second2);

        if(calendar.getTimeInMillis() != mytime.getTimeInMillis() ){
            System.out.println("���� ����� ����������");
        }
        else
        {
            System.out.println("���� ����� ��������");
        }
    }
}