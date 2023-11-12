package pr11;

import java.util.Date;

public class task1 {
    public static void main(String[] args)
    {
        int year = 2023;
        int month = 03;
        int day = 3;
        int hour = 20;
        int minute = 15;
        System.out.printf("Фамилия: Борзов Год: %s Месяц: %s День: %s Час: %s Минут: %s\n",year,month,day,hour,minute);
        Date date = new Date();
        System.out.println("Дата сдачи: " + date);
    }
}