package pr6.pr6_11;

// ����� ��� ����������� ����������� �� ������� � ����������
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9/5) + 32;
    }
}