package abstract_factory.extendingTheHouse.house;

import abstract_factory.extendingTheHouse.door.Door;
import abstract_factory.extendingTheHouse.door.LargeDoor;
import abstract_factory.extendingTheHouse.wall.Wall;
import abstract_factory.extendingTheHouse.wall.WoodWall;
import abstract_factory.extendingTheHouse.window.StructuredWindow;
import abstract_factory.extendingTheHouse.window.Window;

public class WoodHouse extends House{
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
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
