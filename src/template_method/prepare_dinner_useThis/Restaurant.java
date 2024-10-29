package template_method.prepare_dinner_useThis;

public abstract class Restaurant {
    public final void prepareDinner(){
        serveWater();
        prepareVegetables();
        prepareMainMenu();
        prepareCheese();
        prepareDessert();
        prepareCoffee();
        cleanTable();
    }

    abstract void prepareVegetables();

    abstract void prepareMainMenu();

    abstract void prepareCheese();

    abstract void prepareDessert();

    abstract void prepareCoffee();

    private void serveWater() {
        System.out.println("Serving water...");
    }
    private void cleanTable() {
        System.out.println("Cleaning table...");
    }
}
