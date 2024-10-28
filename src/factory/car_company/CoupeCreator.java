package factory.car_company;

public class CoupeCreator extends CarCreator {
    @Override
    protected Car createCar() {
        return new Coupe();
    }
}
