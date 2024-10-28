package decorator.shape_decorators;

public class Circle implements Shape{
    private int diameter;
    public Circle(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        System.out.println();
        System.out.println("Drawing Circle with the diameter of " + diameter + "mm");
    }
}
