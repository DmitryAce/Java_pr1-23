package pr3.pr3_2;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

}
