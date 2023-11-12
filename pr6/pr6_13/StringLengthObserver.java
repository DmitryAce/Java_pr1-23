package pr6.pr6_13;

// Пример наблюдателя
class StringLengthObserver implements Observer {
    @Override
    public void update(String newState) {
        int length = newState.length();
        System.out.println("Длина строки: " + length);
    }
}