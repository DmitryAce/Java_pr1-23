package pr17.pr17_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // ���������� �������� �� ���� ������
        Student student = retrieveStudentFromDatabase();

        // �������� ������, ������������� � �����������
        Student model = new Student();
        model.setName(student.getName());
        model.setRollNo(student.getRollNo());

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        // ��������� �������������
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        // ������������� ���������� �������� �� ���� ������
        Student student = new Student();
        student.setName("John Doe");
        student.setRollNo("12345");
        return student;
    }
}

/*
* ������ � ������������ ������-������� ����������(model).
* ��� � ���������� ������������� ���������� (view).
* ���������� � ��������� ������� ���������� (controller)
* */