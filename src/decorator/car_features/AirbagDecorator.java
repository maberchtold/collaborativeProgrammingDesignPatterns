package decorator.car_features;

public class AirbagDecorator extends CarDecorator {

    public AirbagDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", Airbag";
    }

    @Override
    public double getCost() {
        return car.getCost() + 1000;
    }

    @Override
    public int getSecurityLevel() {
        return car.getSecurityLevel() + 2;
    }
}
