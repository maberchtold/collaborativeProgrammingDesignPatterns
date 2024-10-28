package decorator.shape_decorators;

public class ColorDecorator extends ShapeDecorator{
    private String color;

    public ColorDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Color: "+color);
    }
}
