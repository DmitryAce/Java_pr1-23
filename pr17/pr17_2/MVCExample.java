package pr17.pr17_2;

public class MVCExample {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
    }
}

// Уровень Представления
// Уровень Обработки
// Урвоень Модели