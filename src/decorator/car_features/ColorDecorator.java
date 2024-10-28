package decorator.car_features;

public class ColorDecorator extends CarDecorator {
    public ColorDecorator(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Custom Color";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }

    @Override
    public int getSecurityLevel() {
        return super.getSecurityLevel();
    }
}
