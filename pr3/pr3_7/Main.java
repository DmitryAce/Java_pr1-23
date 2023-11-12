package pr3.pr3_7;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter(70.0); // Установка курса обмена (1 USD = 70 RUB)

        Employee[] employees = new Employee[]{
                new Employee("Иванов Иван Иванович", 5000.0),
                new Employee("Петров Петр Петрович", 6000.0),
                new Employee("Иванов Петр Иванович", 5500.0)
        };

        Report.generateReport(employees, converter);
    }
}