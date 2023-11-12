package pr4_1.pr4_1_10;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("����������", 100.0, 0.1);
        Transport airplane = new Airplane("�������", 900.0, 0.3);
        Transport train = new Train("�����", 120.0, 0.2);
        Transport ship = new Ship("�������", 50.0, 0.05);

        double distance = 500.0; // ���������� � ����������
        int numPassengers = 50; // ���������� ����������
        double cargoWeight = 1000.0; // ��� ����� � �����������

        // ������������ ����� � ��������� ��������� ��� ������� ������������� ��������
        System.out.println(car.getName() + ":\n�����: " + car.calculateTime(distance) + " �����");
        System.out.println("��������� ������������ ���������: " + car.calculatePassengerTransportCost(distance, numPassengers) + " ���.");
        System.out.println("��������� �������� ���������: " + car.calculateCargoTransportCost(distance, cargoWeight) + " ���.\n");

        System.out.println(airplane.getName() + ":\n�����: " + airplane.calculateTime(distance) + " �����");
        System.out.println("��������� ������������ ���������: " + airplane.calculatePassengerTransportCost(distance, numPassengers) + " ���.");
        System.out.println("��������� �������� ���������: " + airplane.calculateCargoTransportCost(distance, cargoWeight) + " ���.\n");

        System.out.println(train.getName() + ":\n�����: " + train.calculateTime(distance) + " �����");
        System.out.println("��������� ������������ ���������: " + train.calculatePassengerTransportCost(distance, numPassengers) + " ���.");
        System.out.println("��������� �������� ���������: " + train.calculateCargoTransportCost(distance, cargoWeight) + " ���.\n");

        System.out.println(ship.getName() + ":\n�����: " + ship.calculateTime(distance) + " �����");
        System.out.println("��������� ������������ ���������: " + ship.calculatePassengerTransportCost(distance, numPassengers) + " ���.");
        System.out.println("��������� �������� ���������: " + ship.calculateCargoTransportCost(distance, cargoWeight) + " ���.");
    }
}
