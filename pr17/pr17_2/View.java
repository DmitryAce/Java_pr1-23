package pr17.pr17_2;
import javax.swing.*;
import java.awt.event.ActionListener;

public class View {
    private JFrame frame;
    private JTextField textField;
    private JButton button;

    public View() {
        frame = new JFrame("MVC Example");
        textField = new JTextField(20);
        button = new JButton("Show Name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public String getEnteredName() {
        return textField.getText();
    }

    public void setButtonListener(ActionListener listener) {
        button.addActionListener(listener);
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }
}
