package abstract_factory.extendingTheHouse.house;

import abstract_factory.extendingTheHouse.door.Door;
import abstract_factory.extendingTheHouse.wall.Wall;
import abstract_factory.extendingTheHouse.window.Window;

public abstract class House {
    protected String name = "";
    protected Wall southWall;
    protected Wall northWall;
    protected Wall westWall;
    protected Wall eastWall;
    protected Window window;
    protected Door door;

    public void buildHouse() {
        southWall = createWall();
        northWall = createWall();
        westWall = createWall();
        eastWall = createWall();

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

        window = createWindow();
        door = createDoor();
    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() + westWall.getPrice() + northWall.getPrice() + eastWall.getPrice() + (int)window.getPrice() + (int)door.getPrice();
    }

    protected abstract Wall createWall();

    protected abstract Window createWindow();

    protected abstract Door createDoor();
}
