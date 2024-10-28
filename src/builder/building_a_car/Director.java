package builder.building_a_car;

public class Director {

        // The director method to construct a sports car
    public Car constructSportsCar(CarBuilder builder) {
        return builder
                .bodyStyle("Coupe")
                .power("500 HP")
                .engine("V8")
                .breaks("Ceramic Brakes")
                .seats("2")
                .windows("Tinted")
                .fuelType("Petrol")
                .build();
    }

    // The director method to construct a berlin car
    public Car constructBerlinCar(CarBuilder builder) {
        return builder
                .bodyStyle("Sedan")
                .power("120 HP")
                .engine("1.8L")
                .breaks("ABS")
                .seats("5")
                .windows("Electric")
                .fuelType("Diesel")
                .build();
    }
}
