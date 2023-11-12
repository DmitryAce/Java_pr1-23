package pr4_1.pr4_1_3;

public class Person {
    private String fullName;
    private int age;

    // ����������� �� ���������
    public Person() {
        fullName = "�����������";
        age = 0;
    }

    // ����������� � �����������
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // ����� ��� ��������
    public void move() {
        System.out.println(fullName + " ����");
    }

    // ����� ��� ���������
    public void talk() {
        System.out.println(fullName + " �������");
    }

    public static void main(String[] args) {
        // ������� ��� ������� ������ Person � ������� ��������������
        Person person1 = new Person();
        Person person2 = new Person("������� ������", 19);

        // �������� ������ ��� ������� �������
        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
