package template_method.prepare_dinner_useThis;

public class ItalianRestaurant extends Restaurant {
    @Override
    void prepareVegetables() {
        System.out.println("Preparing Italian Vegetables");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Preparing Italian Main Menu");
    }

    @Override
    void prepareCheese() {
        System.out.println("Preparing Italian Cheese");
    }

    @Override
    void prepareDessert() {
        System.out.println("Preparing Italian Dessert");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Preparing Italian Coffee");
    }
}
