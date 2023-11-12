package pr5.pr5_4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationDemo extends JFrame {
    private ImageIcon[] frames;
    private JLabel label;
    private int currentFrame = 0;

    public AnimationDemo() {
        frames = new ImageIcon[4]; // количество кадров в анимации
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new ImageIcon("F:/Code/Java/MIREA/Java practice lessons/src/pr5/pr5_4/bolt" + i + ".png"); // путь к файлам изображений
        }

        label = new JLabel(frames[currentFrame]);
        add(label);

        Timer timer = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                label.setIcon(frames[currentFrame]);
            }
        });
        timer.start();

        setPreferredSize(new Dimension(800, 600));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnimationDemo();
            }
        });
    }
}
