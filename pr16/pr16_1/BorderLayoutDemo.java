package pr16.pr16_1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorderLayoutDemo {
    private JFrame frame;

    public BorderLayoutDemo() {
        frame = new JFrame("����� ���������� � ������!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);
        centerPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "����� ���������� � ���");
            }
        });
        frame.add(centerPanel, BorderLayout.CENTER);

        JPanel westPanel = new JPanel();
        westPanel.setBackground(Color.LIGHT_GRAY);
        westPanel.setPreferredSize(new Dimension(100, 400)); // ��������� �������� ��� �������� ������
        westPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "����� ���������� � ���");
            }
        });
        frame.add(westPanel, BorderLayout.WEST);

        JPanel southPanel = new JPanel();
        southPanel.setBackground(Color.CYAN);
        southPanel.setPreferredSize(new Dimension(400, 100)); // ��������� �������� ��� ����� ������
        southPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "����� ���������� � ���");
            }
        });
        frame.add(southPanel, BorderLayout.SOUTH);

        JPanel northPanel = new JPanel();
        northPanel.setBackground(Color.ORANGE);
        northPanel.setPreferredSize(new Dimension(400, 100)); // ��������� �������� ��� �������� ������
        northPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "����� ���������� � ���");
            }
        });
        frame.add(northPanel, BorderLayout.NORTH);

        JPanel eastPanel = new JPanel();
        eastPanel.setBackground(Color.PINK);
        eastPanel.setPreferredSize(new Dimension(100, 400)); // ��������� �������� ��� ��������� ������
        eastPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "����� ���������� � ���");
            }
        });
        frame.add(eastPanel, BorderLayout.EAST);

        frame.setSize(600, 600); // ��������� ������� ����
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
