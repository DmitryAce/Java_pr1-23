package pr6.pr6_13;
import java.util.ArrayList;
import java.util.List;

// Класс для StringBuilder с поддержкой наблюдателей
class StringBuilderWithObserver {
    private StringBuilder stringBuilder;
    private List<Observer> observers;

    public StringBuilderWithObserver() {
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    // Добавление символа к строке
    public void append(char c) {
        stringBuilder.append(c);
        notifyObservers();
    }

    // Удаление символа из строки
    public void deleteCharAt(int index) {
        if (index >= 0 && index < stringBuilder.length()) {
            stringBuilder.deleteCharAt(index);
            notifyObservers();
        }
    }

    // Регистрация наблюдателя
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Удаление наблюдателя
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Оповещение всех наблюдателей об изменении состояния
    private void notifyObservers() {
        String newState = stringBuilder.toString();
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }

    // Получение текущей строки
    public String toString() {
        return stringBuilder.toString();
    }
}
