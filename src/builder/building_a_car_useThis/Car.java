package builder.building_a_car_useThis;

public class Car {
    private String bodyStyle;
    private String power;
    private String engine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private final String carType;

    Car(String carType, String bodyStyle, String power, String engine, String breaks, String seats, String windows, String fuelType) {
        this.carType = carType;
        this.bodyStyle = bodyStyle;
        this.power = power;
        this.engine = engine;
        this.breaks = breaks;
        this.seats = seats;
        this.windows = windows;
        this.fuelType = fuelType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public String getPower() {
        return power;
    }

    public String getEngine() {
        return engine;
    }

    public String getBreaks() {
        return breaks;
    }

    public String getSeats() {
        return seats;
    }

    public String getWindows() {
        return windows;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "bodyStyle='" + bodyStyle + '\'' +
                ", power='" + power + '\'' +
                ", engine='" + engine + '\'' +
                ", breaks='" + breaks + '\'' +
                ", seats='" + seats + '\'' +
                ", windows='" + windows + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", carType='" + carType + '\'' +
                '}';
    }
}
