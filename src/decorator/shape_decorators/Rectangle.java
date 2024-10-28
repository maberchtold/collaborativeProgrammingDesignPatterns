package decorator.shape_decorators;

public class Rectangle implements Shape {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("Draw Rectangle with the width " + width+"mm and length " + length+"mm");
    }
}
