package pr17.pr17_1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Извлечение студента из базы данных
        Student student = retrieveStudentFromDatabase();

        // Создание модели, представления и контроллера
        Student model = new Student();
        model.setName(student.getName());
        model.setRollNo(student.getRollNo());

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        // Обновляем представление
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        // Моделирование извлечения студента из базы данных
        Student student = new Student();
        student.setName("John Doe");
        student.setRollNo("12345");
        return student;
    }
}

/*
* Модель — представляет бизнес-уровень приложения(model).
* Вид — определяет представление приложения (view).
* Контроллер — управляет потоком приложения (controller)
* */