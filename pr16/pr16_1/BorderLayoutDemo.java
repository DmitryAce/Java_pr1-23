package pr16.pr16_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorderLayoutDemo {
    private JFrame frame;

    public BorderLayoutDemo() {
        frame = new JFrame("Добро пожаловать в Москву!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЦАО");
            }
        });
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.LIGHT_GRAY);
        westPanel.setPreferredSize(new Dimension(100, 400)); // Установка размеров для западной панели
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЗАО");
            }
        });
        frame.add(westPanel, BorderLayout.WEST);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.CYAN);
        southPanel.setPreferredSize(new Dimension(400, 100)); // Установка размеров для южной панели
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ЮАО");
            }
        });
        frame.add(southPanel, BorderLayout.SOUTH);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.ORANGE);
        northPanel.setPreferredSize(new Dimension(400, 100)); // Установка размеров для северной панели
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в САО");
            }
        });
        frame.add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.PINK);
        eastPanel.setPreferredSize(new Dimension(100, 400)); // Установка размеров для восточной панели
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Добро пожаловать в ВАО");
            }
        });
        frame.add(eastPanel, BorderLayout.EAST);

        frame.setSize(600, 600); // Установка размера окна
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BorderLayoutDemo();
            }
        });
    }
}
