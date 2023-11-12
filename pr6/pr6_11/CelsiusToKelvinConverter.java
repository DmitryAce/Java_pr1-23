package pr6.pr6_11;

// Класс для конвертации температуры из Цельсия в Кельвины
class CelsiusToKelvinConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return temperature + 273.15;
    }
}