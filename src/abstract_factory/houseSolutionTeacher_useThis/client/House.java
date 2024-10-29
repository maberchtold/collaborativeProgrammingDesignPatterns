package abstract_factory.houseSolutionTeacher_useThis.client;


import abstract_factory.houseSolutionTeacher_useThis.doors.Door;
import abstract_factory.houseSolutionTeacher_useThis.factories.HouseFactory;
import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;
import abstract_factory.houseSolutionTeacher_useThis.windows.Window;

public class House {

    private HouseFactory houseFactory;

    private String name = "";

    private Wall southWall;
    private Wall northWall;
    private Wall westWall;
    private Wall eastWall;
    private Window southWindow;
    private Window westWindow;
    private Door eastDoor;

    public House(String name, HouseFactory houseFactory) {
        this.name = name;
        this.houseFactory = houseFactory;
    }

    public void buildHouse() {
        southWall = houseFactory.createWall();
        northWall = houseFactory.createWall();
        westWall = houseFactory.createWall();
        eastWall = houseFactory.createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        southWindow = attachWindow(southWall);
        westWindow = attachWindow(westWall);

        eastDoor = attachDoor(eastWall);

    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() 
                + westWall.getPrice()
                + northWall.getPrice()
                + eastWall.getPrice()
                + southWindow.getPrice()
                + westWindow.getPrice()
                + eastDoor.getPrice();
    }

    private Door attachDoor(Wall w) {
        Door door = houseFactory.createDoor();
        door.buildOnWall(w);
        return door;
    }

    private Window attachWindow(Wall w) {
        Window window = houseFactory.createWindow();
        window.buildOnWall(w);
        return window;
    }
    }
