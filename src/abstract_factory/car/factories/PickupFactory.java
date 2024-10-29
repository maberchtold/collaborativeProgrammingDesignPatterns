package abstract_factory.car.factories;


import abstract_factory.car.products.Car;
import abstract_factory.car.products.Pickup;

public class PickupFactory implements CarFactory {

    public Car createCar() {
        return new Pickup();
    }

}
