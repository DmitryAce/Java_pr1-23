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

        // ������� ������������� �������
        int charCount = manipulator.countCharacters(inputString);
        System.out.println("���������� �������� � ������: " + charCount);

        String oddPositionChars = manipulator.getCharactersAtOddPositions(inputString);
        System.out.println("������� �� �������� ��������: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("��������������� ������: " + reversedString);
    }
}

/*
StringBuilder ������������� ����� ����������� ������ ������ �� �������� �� ��������� � ������� ���������� ������������ (+),
�������� ����� ����� ����������� �������� ���������� ������.
�������� ������� StringBuilder �� ������� ������ (String) ����������� � ���,
��� StringBuilder ������������ ����� ���������� ������������������ ��������,
� �� ����� ��� ������ String �������� �������������.
*/