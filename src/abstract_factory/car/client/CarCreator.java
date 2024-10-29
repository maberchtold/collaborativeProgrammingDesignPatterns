package abstract_factory.car.client;

import abstract_factory.car.factories.CarFactory;
import abstract_factory.car.products.Car;

public class CarCreator {

    private CarFactory carFactory;

    public CarCreator(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

    protected Car createCar() {
        return carFactory.createCar();
    }

}
