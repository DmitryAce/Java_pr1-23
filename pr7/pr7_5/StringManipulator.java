package pr7.pr7_5;

public interface StringManipulator {

    // Функция подсчета символов в строке
    int countCharacters(String s);

    // Функция, возвращающая строку, состоящую из символов на нечетных позициях
    String getCharactersAtOddPositions(String s);

    // Функция инвертирования строки
    String reverseString(String s);
}
