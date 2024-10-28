package builder.building_a_car;

public class CarBuilder {
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private final String carType;

    public CarBuilder(String carType) {
        this.carType = carType;
    }// Mandatory attribute

    public CarBuilder bodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
        return this;
    }

    public CarBuilder power(String power) {
        this.power = power;
        return this;
    }

    public CarBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder breaks(String breaks) {
        this.breaks = breaks;
        return this;
    }

    public CarBuilder seats(String seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder windows(String windows) {
        this.windows = windows;
        return this;
    }

    public CarBuilder fuelType(String fuelType) {
        this.fuelType = fuelType;
        return this;
    }

    public Car build() {
        return new Car(carType, bodyStyle, power, engine, breaks, seats, windows, fuelType);
    }
}
