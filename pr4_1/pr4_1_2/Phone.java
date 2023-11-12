package pr4_1.pr4_1_2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)
    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    // Конструктор без параметров (вызывает конструктор с двумя параметрами)
    public Phone() {
        this("", "");
    }

    // Метод для получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод для принятия звонка
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Перегруженный метод для принятия звонка с номером телефона
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " (" + callerNumber + ")\n");
    }

    // Метод для отправки сообщения
    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправляются сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // Геттер для модели телефона
    public String getModel() {
        return model;
    }

    // Геттер для веса телефона
    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        // Создаем экземпляры класса Phone
        Phone phone1 = new Phone("123-456-789", "iPhone 12", 0.2);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy");
        Phone phone3 = new Phone();

        // Выводим информацию о каждом телефоне
        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight() + " кг\n");

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight() + " кг\n");

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight() + " кг\n");

        // Принимаем звонки на телефонах
        phone1.receiveCall("John Doe\n");
        phone2.receiveCall("Alice Smith", "985-883-85-75");

        // Отправляем сообщения
        phone1.sendMessage("985-883-85-75", "916-382-55-51");
    }
}

