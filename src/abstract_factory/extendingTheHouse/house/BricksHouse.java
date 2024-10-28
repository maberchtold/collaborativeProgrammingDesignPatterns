package abstract_factory.extendingTheHouse.house;


import abstract_factory.extendingTheHouse.door.Door;
import abstract_factory.extendingTheHouse.door.LargeDoor;
import abstract_factory.extendingTheHouse.wall.BricksWall;
import abstract_factory.extendingTheHouse.wall.Wall;
import abstract_factory.extendingTheHouse.window.StructuredWindow;
import abstract_factory.extendingTheHouse.window.Window;

public class BricksHouse extends House {
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

    @Override
    protected Window createWindow() {
        return new StructuredWindow();
    }

    @Override
    protected Door createDoor() {
        return new LargeDoor();
    }
}
