package pr6.pr6_13;

public class StringBuilderObserverApp {
    public static void main(String[] args) {
        StringBuilderWithObserver builder = new StringBuilderWithObserver();

        // ������� ����������� ��� ����� ������
        Observer lengthObserver = new StringLengthObserver();
        builder.addObserver(lengthObserver);

        // ��������� �������
        builder.append('H');
        builder.append('e');
        builder.append('l');
        builder.append('l');
        builder.append('o');

        System.out.println("������� ������: " + builder.toString());

        // ������� ������
        builder.deleteCharAt(4);

        System.out.println("����� ��������: " + builder.toString());

        // �������� �����������
        builder.removeObserver(lengthObserver);
    }
}