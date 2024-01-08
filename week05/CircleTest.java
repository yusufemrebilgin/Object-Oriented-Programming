package week05;

public class CircleTest {
    public static void main(String[] args) {
        Circle[] circles = {new Circle(5.0), new Circle(10.0), new Circle(15.0)};

        for (Circle c: circles)
            System.out.println(c);
    }
}