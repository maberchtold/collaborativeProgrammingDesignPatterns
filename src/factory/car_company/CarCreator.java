package factory.car_company;

public abstract class CarCreator {
    public Car orderCar(String color){
        Car car = createCar();
        car.setColor(color);
        return car;
    }

    // Factory method
    protected abstract Car createCar();
}
