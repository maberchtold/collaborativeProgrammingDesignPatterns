package decorator.shape_decorators;

public class BorderDecorator extends ShapeDecorator {
    private int borderThickness;

    public BorderDecorator(Shape shape, int borderThickness) {
        super(shape);
        this.borderThickness = borderThickness;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border thickness: "+borderThickness+"mm");
    }
}
