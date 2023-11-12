package pr3.pr3_7;
import java.text.DecimalFormat;
import java.util.Currency;

class Report {
    public static void generateReport(Employee[] employees, CurrencyConverter converter) {
        System.out.println("����� � �����������");
        System.out.println("====================");
        System.out.printf("%-20s %10s%n", "��� ����������", "��������");

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
%-20s ��������� �� ��, ��� ��������� �������� ����� �������� �� ������ ���� � ������ ������� 20 ��������.
���� ������ ������ 20 ��������, �� ����� ��������� ������� ������ ��� ������������.

%10s ��������� �� ��, ��� ��������� �������� ����� �������� �� ������� ���� � ������ ������� 10 ��������.
 ���� ������ ������ 10 ��������, �� ����� ��������� ������� ����� ��� ������������.
%n ������������ ������ ����� ������.
 */

/*
# - ������ ��� �����. �� ����� ������� ����������� ������.
, - ����������� �������� �����. ��� ��������, ��� ����� ����� ��������������� � ����������� �������� ����� ��������.
0 - ������ ��� �����, ������� ������ ����� ������������, ���� ���� ����� ����� ��� �����������.
. - ���������� �����, ������������ ��� ���������� ����� � ���������� ����� �����.
00 - ��� ������� ��� ������� ����� �����. ���� ������� ����� ������ ���� ��������, �� ����� ��������� ���� ������ ��� ������������.
 */