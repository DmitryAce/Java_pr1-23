package pr5.test;
import javax.swing.*;

class FirstGui{
    public static void main(String args[]){
//������� ����� ���� � ������� ������������
//����������� ����� �������� � ���������� ���� � ��� ������
        JFrame frame = new JFrame("My First GUI");
// ������������� ������� ���� �� �������� �� ���������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//������ �������� ���� � ��� ������� � ���������
        frame.setSize(300,300);
//������� ������ � ������� ������������ ������ JButton
//����������� ����� �������� ������ � �������� �� ������
        JButton button = new JButton("Press");
//��������� ������ �� ����
        frame.getContentPane().add(button);
//������ ���� �������
        frame.setVisible(true);
    }
}
