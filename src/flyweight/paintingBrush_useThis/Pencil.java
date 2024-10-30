package flyweight.paintingBrush_useThis;

public class Pencil implements Tool{
    @Override
    public void draw(String content) {
        System.out.println("Pencil writes some content: "+content);
    }
}
