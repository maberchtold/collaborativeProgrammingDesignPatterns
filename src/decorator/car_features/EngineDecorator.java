package decorator.car_features;

public class EngineDecorator extends CarDecorator {

    public EngineDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Enhanced Engine";
    }

    @Override
    public double getCost() {
        return car.getCost() + 3000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 1;
    }
}
