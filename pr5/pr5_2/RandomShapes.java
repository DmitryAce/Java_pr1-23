package pr5.pr5_2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomShapes extends JPanel {
    private List<Shape> shapes;

    public RandomShapes() {
        shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 2000; i++) {
            int x = random.nextInt(500);  // случайная позиция по X
            int y = random.nextInt(500);  // случайная позиция по Y
            int widthOrRadius = random.nextInt(50) + 20;  // случайная ширина или радиус
            int height = random.nextInt(50) + 20;  // случайная высота
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));  // случайный цвет

            // Случайным образом выбираем между кругом и прямоугольником
            if (random.nextBoolean()) {
                shapes.add(new Circle(color, x, y, widthOrRadius));
            } else {
                shapes.add(new Rectangle(color, x, y, widthOrRadius, height));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Random Shapes");
                frame.setSize(500, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                RandomShapes randomShapes = new RandomShapes();
                frame.add(randomShapes);

                frame.setVisible(true);
            }
        });
    }
}