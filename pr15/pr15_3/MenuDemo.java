package pr15.pr15_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDemo {
    private JFrame frame;
    private JTextArea textArea;

    public MenuDemo() {
        frame = new JFrame("��������� � ����");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("����");
        JMenu editMenu = new JMenu("������");
        JMenu helpMenu = new JMenu("�������");

        JMenuItem saveItem = new JMenuItem("���������");
        JMenuItem exitItem = new JMenuItem("�����");
        JMenuItem copyItem = new JMenuItem("����������");
        JMenuItem cutItem = new JMenuItem("��������");
        JMenuItem pasteItem = new JMenuItem("��������");
        JMenuItem aboutItem = new JMenuItem("� ���������");

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // �������� ��� ��� ���������� �����
                JOptionPane.showMessageDialog(frame, "���� ��������.");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        copyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.copy();
            }
        });

        cutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.cut();
            }
        });

        pasteItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.paste();
            }
        });

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "������ ��������� � ����.");
            }
        });

        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(cutItem);
        editMenu.add(pasteItem);
        helpMenu.add(aboutItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);

        textArea = new JTextArea();
        frame.add(new JScrollPane(textArea));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDemo();
            }
        });
    }
}
