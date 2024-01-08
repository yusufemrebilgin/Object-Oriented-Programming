package week05;

class Circle {
    private final double radius;
    private final static double PI = Math.PI;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Area of a circle with radius " + radius + ": " + calculateArea();
    }
}