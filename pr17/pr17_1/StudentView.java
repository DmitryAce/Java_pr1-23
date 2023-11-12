package pr17.pr17_1;

// Создание класса представления.
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Студент: ");
        System.out.println("Имя: " + studentName);
        System.out.println("Номер студенческого билета: " + studentRollNo);
    }
}