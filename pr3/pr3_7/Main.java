package pr3.pr3_7;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(70.0); // ��������� ����� ������ (1 USD = 70 RUB)

        Employee[] employees = new Employee[]{
                new Employee("������ ���� ��������", 5000.0),
                new Employee("������ ���� ��������", 6000.0),
                new Employee("������ ���� ��������", 5500.0)
        };

        Report.generateReport(employees, converter);
    }
}