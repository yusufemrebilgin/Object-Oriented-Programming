package week09;

class Pyramid extends Shape3D {

    public Pyramid(int depth, int height, int width) {
        super((double)depth, height, width);
    }

    @Override
    public double getVolume() {
        return super.depth * super.height * super.width / 3.0;
    }

    @Override
    public double getArea() {
        return 0.0;
    }
}
