package pr6.pr6_13;

public class StringBuilderObserverApp {
    public static void main(String[] args) {
        StringBuilderWithObserver builder = new StringBuilderWithObserver();

        // Создаем наблюдателя для длины строки
        Observer lengthObserver = new StringLengthObserver();
        builder.addObserver(lengthObserver);

        // Добавляем символы
        builder.append('H');
        builder.append('e');
        builder.append('l');
        builder.append('l');
        builder.append('o');

        System.out.println("Текущая строка: " + builder.toString());

        // Удаляем символ
        builder.deleteCharAt(4);

        System.out.println("После удаления: " + builder.toString());

        // Удаление наблюдателя
        builder.removeObserver(lengthObserver);
    }
}