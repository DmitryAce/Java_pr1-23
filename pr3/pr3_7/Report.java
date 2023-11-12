package pr3.pr3_7;
import java.text.DecimalFormat;
import java.util.Currency;

class Report {
    public static void generateReport(Employee[] employees, CurrencyConverter converter) {
        System.out.println("Отчет о сотрудниках");
        System.out.println("====================");
        System.out.printf("%-20s %10s%n", "ФИО сотрудника", "Зарплата");

        for (Employee employee : employees) {
            String fullname = employee.getFullname();
            double salary = employee.getSalary();
            double convertedSalary = converter.convert(salary);
            System.out.printf("%-20s %10s%n", fullname, formatCurrency(convertedSalary));
        }
    }

    private static String formatCurrency(double amount) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        //return decimalFormat.format(amount) + " " + Currency.getInstance("RUB").getSymbol();
        return decimalFormat.format(amount) + " RUB" ;
    }
}

/*
%-20s указывает на то, что следующий аргумент будет выровнен по левому краю и займет минимум 20 символов.
Если строка короче 20 символов, то будет добавлены пробелы справа для выравнивания.

%10s указывает на то, что следующий аргумент будет выровнен по правому краю и займет минимум 10 символов.
 Если строка короче 10 символов, то будут добавлены пробелы слева для выравнивания.
%n представляет символ новой строки.
 */

/*
# - символ для цифры. Он будет заменен фактической цифрой.
, - разделитель разрядов тысяч. Это означает, что числа будут отформатированы с разделением разрядов тысяч запятыми.
0 - символ для цифры, который всегда будет отображаться, даже если цифры перед ним отсутствуют.
. - десятичная точка, используется для разделения целой и десятичной части числа.
00 - два символа для дробной части числа. Если дробная часть короче двух символов, то будут добавлены нули справа для выравнивания.
 */