package pr4_1.pr4_1_1;

// Дочерний класс Square (Квадрат)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public String getType() {
        return "Квадрат";
    }
}
