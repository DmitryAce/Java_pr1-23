package pr6.pr6_13;
import java.util.ArrayList;
import java.util.List;

// ����� ��� StringBuilder � ���������� ������������
class StringBuilderWithObserver {
    private StringBuilder stringBuilder;
    private List<Observer> observers;

    public StringBuilderWithObserver() {
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    // ���������� ������� � ������
    public void append(char c) {
        stringBuilder.append(c);
        notifyObservers();
    }

    // �������� ������� �� ������
    public void deleteCharAt(int index) {
        if (index >= 0 && index < stringBuilder.length()) {
            stringBuilder.deleteCharAt(index);
            notifyObservers();
        }
    }

    // ����������� �����������
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // �������� �����������
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // ���������� ���� ������������ �� ��������� ���������
    private void notifyObservers() {
        String newState = stringBuilder.toString();
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }

    // ��������� ������� ������
    public String toString() {
        return stringBuilder.toString();
    }
}
