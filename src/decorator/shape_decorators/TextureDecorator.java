package decorator.shape_decorators;

public class TextureDecorator extends ShapeDecorator {
    private String textureName;

    public TextureDecorator(Shape shape, String textureName) {
        super(shape);
        this.textureName = textureName;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("Texture: "+textureName);
    }
}
