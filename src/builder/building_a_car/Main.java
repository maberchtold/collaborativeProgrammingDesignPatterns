package builder.building_a_car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder("CarCar");
        Director director = new Director();

        Car car1 = director.constructBerlinCar(builder);
        Car car2 = director.constructSportsCar(builder);

        System.out.println(car1);
        System.out.println(car2);
    }
}
