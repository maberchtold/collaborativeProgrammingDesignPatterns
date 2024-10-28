package decorator.car_features;

public class CarBreak implements Car{
    @Override
    public String getDescription() {
        return "Car Break";
    }

    @Override
    public double getCost() {
        return 25000;
    }

    @Override
    public int getSecurityLevel() {
        return 6;
    }
}
