package pr4_1.pr4_1_3;

public class Person {
    private String fullName;
    private int age;

    // Конструктор по умолчанию
    public Person() {
        fullName = "Неизвестный";
        age = 0;
    }

    // Конструктор с параметрами
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Метод для движения
    public void move() {
        System.out.println(fullName + " идет");
    }

    // Метод для разговора
    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        // Создаем два объекта класса Person с разными конструкторами
        Person person1 = new Person();
        Person person2 = new Person("Дмитрий Борзов", 19);

        // Вызываем методы для каждого объекта
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
