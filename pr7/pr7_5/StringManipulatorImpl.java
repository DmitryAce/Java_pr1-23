package pr7.pr7_5;

public class StringManipulatorImpl implements StringManipulator {

    @Override
    public int countCharacters(String s) {
        return s.length();
    }

    @Override
    public String getCharactersAtOddPositions(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulatorImpl();
        String inputString = "Hello, World!";

        // Примеры использования функций
        int charCount = manipulator.countCharacters(inputString);
        System.out.println("Количество символов в строке: " + charCount);

        String oddPositionChars = manipulator.getCharactersAtOddPositions(inputString);
        System.out.println("Символы на нечетных позициях: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("Инвертированная строка: " + reversedString);
    }
}

/*
StringBuilder предоставляет более эффективный способ работы со строками по сравнению с обычным оператором конкатенации (+),
особенно когда нужно многократно изменять содержимое строки.
Основное отличие StringBuilder от обычной строки (String) заключается в том,
что StringBuilder представляет собой изменяемую последовательность символов,
в то время как строки String являются неизменяемыми.
*/