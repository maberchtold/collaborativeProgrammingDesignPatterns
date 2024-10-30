package flyweight.paintingBrush_useThis;

public class Brush implements Tool{
    private String size;
    private String color;

    public Brush(String size, String color) {
        this.size = size;
        this.color = color;
    }

    @Override
    public void draw(String content) {
        System.out.println("Drawing '" + content + "' in " + size + ", color:" + color);
    }
}
