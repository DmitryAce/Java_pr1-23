package pr19;

public class OnlinePurchase {
    public void processOrder(String name, String inn) throws InvalidINNException {
        // ��������� ��������� ��� �� ����������������
        if (!isValidINN(inn)) {
            throw new InvalidINNException("���������������� ���: " + inn);
        }
        // ������ ������ ��� ��������� ������
        System.out.println("����� ������� ���������.");
    }

    private boolean isValidINN(String inn) {
        // ������� true, ���� ��� ������������, ����� false
        return inn.matches("\\d{10}");
        /*��� ���������� ��������� ������������ ��� �������� ������ �� ������� ����� 10 ���� ������. */
    }

    public static void main(String[] args) {
        OnlinePurchase purchase = new OnlinePurchase();

        try {
            purchase.processOrder("���� ������", "123456890"); // ���������� ������ ���������������� ���
        } catch (InvalidINNException e) {
            System.out.println("������: " + e.getMessage());
        }
    }
}