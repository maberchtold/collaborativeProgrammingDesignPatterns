package template_method.prepare_dinner;

public class Main {
    public static void main(String[] args) {
        ThaiRestaurant tr = new ThaiRestaurant();
        ItalianRestaurant ir = new ItalianRestaurant();

        tr.prepareCheese();
        System.out.println();
        ir.prepareDinner();
    }
}