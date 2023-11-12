package pr4_1.pr4_1_2;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // ����������� � ����� �����������
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // ����������� � ����� ����������� (�������� ����������� � ����� �����������)
    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    // ����������� ��� ���������� (�������� ����������� � ����� �����������)
    public Phone() {
        this("", "");
    }

    // ����� ��� ��������� ������ ��������
    public String getNumber() {
        return number;
    }

    // ����� ��� �������� ������
    public void receiveCall(String callerName) {
        System.out.println("������ " + callerName);
    }

    // ������������� ����� ��� �������� ������ � ������� ��������
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("������ " + callerName + " (" + callerNumber + ")\n");
    }

    // ����� ��� �������� ���������
    public void sendMessage(String... phoneNumbers) {
        System.out.println("������������ ��������� �� ��������� ������:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }

    // ������ ��� ������ ��������
    public String getModel() {
        return model;
    }

    // ������ ��� ���� ��������
    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        // ������� ���������� ������ Phone
        Phone phone1 = new Phone("123-456-789", "iPhone 12", 0.2);
        Phone phone2 = new Phone("987-654-321", "Samsung Galaxy");
        Phone phone3 = new Phone();

        // ������� ���������� � ������ ��������
        System.out.println("������� 1:");
        System.out.println("�����: " + phone1.getNumber());
        System.out.println("������: " + phone1.getModel());
        System.out.println("���: " + phone1.getWeight() + " ��\n");

        System.out.println("������� 2:");
        System.out.println("�����: " + phone2.getNumber());
        System.out.println("������: " + phone2.getModel());
        System.out.println("���: " + phone2.getWeight() + " ��\n");

        System.out.println("������� 3:");
        System.out.println("�����: " + phone3.getNumber());
        System.out.println("������: " + phone3.getModel());
        System.out.println("���: " + phone3.getWeight() + " ��\n");

        // ��������� ������ �� ���������
        phone1.receiveCall("John Doe\n");
        phone2.receiveCall("Alice Smith", "985-883-85-75");

        // ���������� ���������
        phone1.sendMessage("985-883-85-75", "916-382-55-51");
    }
}

