package decorator.car_features;

public class CarSport implements Car {

    @Override
    public String getDescription() {
        return "Car Sport";
    }

    @Override
    public double getCost() {
        return 30000;
    }

    @Override
    public int getSecurityLevel() {
        return 7;
    }
}
