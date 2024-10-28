package abstract_factory.extendingTheHouse.house;

import abstract_factory.extendingTheHouse.door.Door;
import abstract_factory.extendingTheHouse.door.ThinDoor;
import abstract_factory.extendingTheHouse.wall.GlassWall;
import abstract_factory.extendingTheHouse.wall.Wall;
import abstract_factory.extendingTheHouse.window.FloorWindow;
import abstract_factory.extendingTheHouse.window.Window;

public class GlassHouse extends House{
    public GlassHouse() {
        this.name = "Moder German house";
    }

    @Override
    protected Wall createWall() {
        return new GlassWall();
    }

    @Override
    protected Window createWindow() {
        return new FloorWindow();
    }

    @Override
    protected Door createDoor() {
        return new ThinDoor();
    }
}
