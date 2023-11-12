package pr16.pr16_3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordCheckApp {
    public PasswordCheckApp() {
        JFrame frame = new JFrame("�������� ������");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 2)); // ���������� GridLayout

        JLabel serviceLabel = new JLabel("Service:");
        JTextField serviceField = new JTextField(20);
        JLabel userNameLabel = new JLabel("User name:");
        JTextField userNameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JButton submitButton = new JButton("���������");

        frame.add(serviceLabel);
        frame.add(serviceField);
        frame.add(userNameLabel);
        frame.add(userNameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String service = serviceField.getText();
                String userName = userNameField.getText();
                char[] password = passwordField.getPassword();

                // ����� �� ������ �������� �������� ������ � ������������������ ����������
                String presetService = "SCP";
                String presetUserName = "dmitryace";
                String presetPassword = "12345";

                if (service.equals(presetService) && userName.equals(presetUserName) && new String(password).equals(presetPassword)) {
                    JOptionPane.showMessageDialog(frame, "������ ������!");
                } else {
                    JOptionPane.showMessageDialog(frame, "������ ��������!");
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordCheckApp();
            }
        });
    }
}
