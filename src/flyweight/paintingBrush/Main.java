package flyweight.paintingBrush;

public class Main {
    public static void main(String[] args) {
        // Get the first thick red brush
        Tool firstThickRedBrush = BrushFactory.getBrush("THICK", "RED");
        firstThickRedBrush.draw("I am drawing with my first thick red brush");

        // Get the second thick red brush (should be the same instance)
        Tool secondThickRedBrush = BrushFactory.getBrush("THICK", "RED");
        secondThickRedBrush.draw("I am drawing with my second thick red brush");

        // Show that both brushes are the same object
        System.out.println("first thick red brush hashcode: " + firstThickRedBrush.hashCode());
        System.out.println("second thick red brush hashcode: " + secondThickRedBrush.hashCode());

        // Create a pencil and use it
        Tool pencil = new Pencil();
        pencil.draw("Bonjour");

        // Get the first thin blue brush
        Tool firstThinBlueBrush = BrushFactory.getBrush("THIN", "BLUE");
        firstThinBlueBrush.draw("I am drawing with my first thin blue brush");

        // Get the second thin blue brush (should be the same instance)
        Tool secondThinBlueBrush = BrushFactory.getBrush("THIN", "BLUE");
        secondThinBlueBrush.draw("I am drawing with my second thin blue brush");

        // Show that both brushes are the same object
        System.out.println("first thin blue brush hashcode: " + firstThinBlueBrush.hashCode());
        System.out.println("second thin blue brush hashcode: " + secondThinBlueBrush.hashCode());
    }
}
