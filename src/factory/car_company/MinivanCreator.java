package factory.car_company;

public class MinivanCreator extends CarCreator {
    @Override
    protected Car createCar() {
        return new Minivan();
    }
}
