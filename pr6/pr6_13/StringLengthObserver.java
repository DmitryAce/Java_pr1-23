package pr6.pr6_13;

// ������ �����������
class StringLengthObserver implements Observer {
    @Override
    public void update(String newState) {
        int length = newState.length();
        System.out.println("����� ������: " + length);
    }
}