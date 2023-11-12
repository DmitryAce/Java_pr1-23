package pr5.pr5_3;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DisplayImage extends JFrame {
    private BufferedImage image;

    public DisplayImage(String imagePath) {
        try {
            // Загрузка изображения из файла
            image = ImageIO.read(new File(imagePath));

            // Установка размеров окна
            setSize(image.getWidth(), image.getHeight());
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Display Image");

            // Создание компонента для отображения изображения
            JPanel panel = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, this);
                }
            };

            // Добавление компонента на окно
            add(panel);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java DisplayImage <image_path>");
            System.exit(1);
        }

        String imagePath = args[0];

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DisplayImage(imagePath).setVisible(true);
            }
        });
    }
}
