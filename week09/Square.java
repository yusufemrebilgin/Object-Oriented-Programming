package week09;

class Square extends Shape2D {

    public Square(double width) {
        super(0.0, width);
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
