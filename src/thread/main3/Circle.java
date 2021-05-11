package thread.main3;

public class Circle {
    private double radius;

    Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void getSquare() {
        double square = Math.PI * radius * radius;
        System.out.println("Square:" + square);
    }

    void getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter:" + perimeter);
    }
}
