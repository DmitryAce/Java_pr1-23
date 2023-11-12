package pr4_1.pr4_1_8;

class Square extends Rectangle {
    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + getColor() + '\'' +
                ", filled=" + isFilled() +
                ", side=" + getWidth() + // Используем геттеры суперкласса
                '}'+"\n";
    }

}