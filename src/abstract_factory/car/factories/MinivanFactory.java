package abstract_factory.car.factories;


import abstract_factory.car.products.Car;
import abstract_factory.car.products.Minivan;

public class MinivanFactory implements CarFactory {

    public Car createCar() {
        return new Minivan();
    }

}
