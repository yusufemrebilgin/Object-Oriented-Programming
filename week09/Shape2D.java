package week09;

abstract class Shape2D {
    final double PI = Math.PI;
    double height;
    double radius;
    double width;

    public Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Shape2D(double radius) {
        this(0.0, 0.0);
        this.radius = radius;
    }

    abstract double getArea();

    @Override
    public String toString() {
        return "2D Shape";
    }
}
