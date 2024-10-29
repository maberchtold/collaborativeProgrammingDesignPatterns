package template_method.prepare_dinner_useThis;

public class ThaiRestaurant extends Restaurant {

    @Override
    void prepareVegetables() {
        System.out.println("Preparing Thai Vegetables");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Preparing Thai Main Menu");
    }

    @Override
    void prepareCheese() {
        System.out.println("Preparing Thai Cheese");
    }

    @Override
    void prepareDessert() {
        System.out.println("Preparing Thai Dessert");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Preparing Thai Coffee");
    }
}
