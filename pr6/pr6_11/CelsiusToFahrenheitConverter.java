package pr6.pr6_11;

// Класс для конвертации температуры из Цельсия в Фаренгейты
class CelsiusToFahrenheitConverter implements Convertable {
    @Override
    public double convert(double temperature) {
        return (temperature * 9/5) + 32;
    }
}