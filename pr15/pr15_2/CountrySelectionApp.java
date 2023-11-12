package pr15.pr15_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountrySelectionApp {
    private JComboBox<String> countryComboBox;

    public CountrySelectionApp() {
        JFrame frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        String[] countries = {"Выберите страну", "Россия", "США", "Канада", "Великобритания", "Германия", "Франция", "Япония"};

        countryComboBox = new JComboBox<>(countries);
        JButton selectButton = new JButton("Выбрать");

        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();
                if (selectedCountry.equals("Выберите страну")) {
                    JOptionPane.showMessageDialog(frame, "Пожалуйста, выберите действительную страну.", "Ошибка", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Вы выбрали: " + selectedCountry, "Выбранная страна", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.add(countryComboBox);
        frame.add(selectButton);

        frame.setSize(250, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CountrySelectionApp();
            }
        });
    }
}
