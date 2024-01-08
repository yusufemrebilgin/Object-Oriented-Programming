package week09;

class Sphere extends Shape3D {

    public Sphere(int depth, double radius) {
        super((double)depth, radius);
    }

    @Override
    public double getVolume() {
        return (double)4 / 3 * super.PI * radius * radius * radius;
    }

    @Override
    public double getArea() {
        return 4 * super.PI * radius * radius;
    }
}
