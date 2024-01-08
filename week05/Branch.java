package week05;

public enum Branch {
    MATH("y' = dx / dy"),
    PHYSICS("E = mc^2"),
    CS ("Hello, world!"),
    ENG("Hello!");

    final String info;

    Branch (String info) {
        this.info = info;
    }
}
