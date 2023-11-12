package pr5.pr5_2;
import java.awt.*;


// ����������� ����� Shape
abstract class Shape {
    protected Color color;
    protected int x, y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    // ����� ��� ��������� ������
    abstract void draw(Graphics g);
}
