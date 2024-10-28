package decorator.car_features;

public class CarBerlin implements Car {

    @Override
    public String getDescription() {
        return "Car Berlin";
    }

    @Override
    public double getCost() {
        return 20000;
    }

    @Override
    public int getSecurityLevel() {
        return 5;
    }
}
