package decorator.car_features;

public class AntiSlidingSystemDecorator extends CarDecorator {
    public AntiSlidingSystemDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Anti-Sliding System";
    }

    @Override
    public double getCost() {
        return car.getCost() + 1500;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 3;
    }
}
