package pr5.pr5_2;
import java.awt.*;


// Класс Rectangle, наследуется от Shape и представляет прямоугольник
class Rectangle extends Shape {
    private int width, height;

    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
