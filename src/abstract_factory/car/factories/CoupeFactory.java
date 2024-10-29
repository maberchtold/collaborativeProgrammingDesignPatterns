package abstract_factory.car.factories;


import abstract_factory.car.products.Car;
import abstract_factory.car.products.Coupe;

public class CoupeFactory implements CarFactory {

    public Car createCar() {
        return new Coupe();
    }

}
