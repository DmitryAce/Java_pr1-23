package pr6.pr6_11;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // ������ ����������� � �������� �������

        // ������� ������� �����������
        Convertable celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        Convertable celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();

        // ��������� �����������
        double kelvinTemperature = celsiusToKelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);

        // ������� ����������
        System.out.println("����������� � �������� �������: " + celsiusTemperature + "�C");
        System.out.println("����������� � �������� ��������: " + kelvinTemperature + "K");
        System.out.println("����������� � �������� ����������: " + fahrenheitTemperature + "�F");
    }
}