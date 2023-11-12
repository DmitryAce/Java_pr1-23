package pr6.pr6_12;
import java.util.ArrayList;
import java.util.List;

public class UndoableStringBuilder {
    private StringBuilder stringBuilder;
    private List<UndoableAction> actions;

    public UndoableStringBuilder() {
        stringBuilder = new StringBuilder();
        actions = new ArrayList<>();
    }

    // Добавление символа к строке
    public void append(char c) {
        stringBuilder.append(c);
        actions.add(new AppendAction(c));
    }

    // Удаление последнего символа из строки
    public void deleteCharAt(int index) {
        if (index >= 0 && index < stringBuilder.length()) {
            char removedChar = stringBuilder.charAt(index);
            stringBuilder.deleteCharAt(index);
            actions.add(new DeleteCharAction(index, removedChar));
        }
    }

    // Отмена последней операции
    public void undo() {
        if (!actions.isEmpty()) {
            UndoableAction lastAction = actions.remove(actions.size() - 1);
            lastAction.undo();
        }
    }

    // Получение текущей строки
    public String toString() {
        return stringBuilder.toString();
    }

    // Внутренний интерфейс для поддержки операции undo
    private interface UndoableAction {
        void undo();
    }

    // Реализация операции добавления символа
    private class AppendAction implements UndoableAction {
        private char character;

        AppendAction(char character) {
            this.character = character;
        }

        @Override
        public void undo() {
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

    // Реализация операции удаления символа
    private class DeleteCharAction implements UndoableAction {
        private int index;
        private char removedChar;

        DeleteCharAction(int index, char removedChar) {
            this.index = index;
            this.removedChar = removedChar;
        }

        @Override
        public void undo() {
            stringBuilder.insert(index, removedChar);
        }
    }

    public static void main(String[] args) {
        UndoableStringBuilder builder = new UndoableStringBuilder();

        // Добавляем символы
        builder.append('H');
        builder.append('e');
        builder.append('l');
        builder.append('l');
        builder.append('o');

        System.out.println("Current string: " + builder.toString());

        // Удаляем символ
        builder.deleteCharAt(4);

        System.out.println("After deletion: " + builder.toString());

        // Отменяем последнюю операцию (удаление)
        builder.undo();

        System.out.println("After undo: " + builder.toString());
    }
}
