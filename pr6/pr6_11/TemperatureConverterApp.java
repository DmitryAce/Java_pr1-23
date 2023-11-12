package pr6.pr6_11;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        double celsiusTemperature = 25.0; // Пример температуры в градусах Цельсия

        // Создаем объекты конвертеров
        Convertable celsiusToKelvinConverter = new CelsiusToKelvinConverter();
        Convertable celsiusToFahrenheitConverter = new CelsiusToFahrenheitConverter();

        // Выполняем конвертацию
        double kelvinTemperature = celsiusToKelvinConverter.convert(celsiusTemperature);
        double fahrenheitTemperature = celsiusToFahrenheitConverter.convert(celsiusTemperature);

        // Выводим результаты
        System.out.println("Температура в градусах Цельсия: " + celsiusTemperature + "°C");
        System.out.println("Температура в градусах Кельвина: " + kelvinTemperature + "K");
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheitTemperature + "°F");
    }
}