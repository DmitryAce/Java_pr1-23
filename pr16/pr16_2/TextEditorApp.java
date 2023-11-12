package pr16.pr16_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorApp {
    private JFrame frame;
    private JTextArea textArea;
    private JMenuBar menuBar;
    private JMenu colorMenu;
    private JMenu fontMenu;

    public TextEditorApp() {
        frame = new JFrame("Текстовый редактор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        textArea = new JTextArea(20, 40);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        textArea.setForeground(Color.BLACK);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        menuBar = new JMenuBar();
        colorMenu = new JMenu("Цвет");
        fontMenu = new JMenu("Шрифт");

        String[] colors = {"Синий", "Красный", "Черный"};
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};

        for (String color : colors) {
            JMenuItem colorItem = new JMenuItem(color);
            colorItem.addActionListener(new ColorMenuItemListener());
            colorMenu.add(colorItem);
        }

        for (String font : fonts) {
            JMenuItem fontItem = new JMenuItem(font);
            fontItem.addActionListener(new FontMenuItemListener());
            fontMenu.add(fontItem);
        }

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        frame.setJMenuBar(menuBar);

        frame.pack();
        frame.setVisible(true);
    }

    private class ColorMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String color = e.getActionCommand();
            switch (color) {
                case "Синий":
                    textArea.setForeground(Color.BLUE);
                    break;
                case "Красный":
                    textArea.setForeground(Color.RED);
                    break;
                case "Черный":
                    textArea.setForeground(Color.BLACK);
                    break;
            }
        }
    }

    private class FontMenuItemListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fontName = e.getActionCommand();
            Font currentFont = textArea.getFont();
            Font newFont = new Font(fontName, currentFont.getStyle(), currentFont.getSize());
            textArea.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextEditorApp();
            }
        });
    }
}
