package decorator.shape_decorators;

public class Square implements Shape {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("Draw square with the width " + width+"mm");
    }
}
