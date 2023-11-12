package pr15.pr15_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JFrame frame;
    private JTextField display;
    private double currentValue;
    private String currentOperator;

    public CalculatorApp() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        display = new JTextField(20);
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "1", "2", "3", "/",
                "4", "5", "6", "*",
                "7", "8", "9", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
                display.setText(display.getText() + command);
            } else if (command.equals("=")) {
                performCalculation();
            } else {
                if (currentOperator != null) {
                    performCalculation();
                }
                currentValue = Double.parseDouble(display.getText());
                currentOperator = command;
                display.setText("");
            }
        }

        private void performCalculation() {
            if (currentOperator != null) {
                double newValue = Double.parseDouble(display.getText());
                switch (currentOperator) {
                    case "+":
                        currentValue += newValue;
                        break;
                    case "-":
                        currentValue -= newValue;
                        break;
                    case "*":
                        currentValue *= newValue;
                        break;
                    case "/":
                        if (newValue != 0) {
                            currentValue /= newValue;
                        } else {
                            display.setText("Error");
                            currentValue = 0;
                            currentOperator = null;
                            return;
                        }
                        break;
                }
                display.setText(Double.toString(currentValue));
                currentOperator = null;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp();
            }
        });
    }
}
