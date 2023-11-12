package pr4_1.pr4_1_6;

public class InheritanceExample {
    public static void main(String[] args) {
        Employer employer1 = new Employer("Иван", "Иванов", 50000);
        Manager manager1 = new Manager("Петр", "Петров", 60000, 2000);

        Employer[] employees = {employer1, manager1};

        for (Employer employee : employees) {
            System.out.println(employee.getIncome());
        }
    }
}