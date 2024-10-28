package factory.car_company;

public class PickupCreator extends CarCreator {
    @Override
    protected Car createCar() {
        return new Pickup();
    }
}
