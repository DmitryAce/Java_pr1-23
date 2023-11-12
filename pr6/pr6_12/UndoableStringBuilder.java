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

    // ���������� ������� � ������
    public void append(char c) {
        stringBuilder.append(c);
        actions.add(new AppendAction(c));
    }

    // �������� ���������� ������� �� ������
    public void deleteCharAt(int index) {
        if (index >= 0 && index < stringBuilder.length()) {
            char removedChar = stringBuilder.charAt(index);
            stringBuilder.deleteCharAt(index);
            actions.add(new DeleteCharAction(index, removedChar));
        }
    }

    // ������ ��������� ��������
    public void undo() {
        if (!actions.isEmpty()) {
            UndoableAction lastAction = actions.remove(actions.size() - 1);
            lastAction.undo();
        }
    }

    // ��������� ������� ������
    public String toString() {
        return stringBuilder.toString();
    }

    // ���������� ��������� ��� ��������� �������� undo
    private interface UndoableAction {
        void undo();
    }

    // ���������� �������� ���������� �������
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

    // ���������� �������� �������� �������
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

        // ��������� �������
        builder.append('H');
        builder.append('e');
        builder.append('l');
        builder.append('l');
        builder.append('o');

        System.out.println("Current string: " + builder.toString());

        // ������� ������
        builder.deleteCharAt(4);

        System.out.println("After deletion: " + builder.toString());

        // �������� ��������� �������� (��������)
        builder.undo();

        System.out.println("After undo: " + builder.toString());
    }
}
