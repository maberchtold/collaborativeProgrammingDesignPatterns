package decorator.car_features;

public class BreakingSystemDecorator extends CarDecorator {
    public BreakingSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Breaking System";
    }

    @Override
    public double getCost() {
        return car.getCost() + 2000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 4;
    }
}
