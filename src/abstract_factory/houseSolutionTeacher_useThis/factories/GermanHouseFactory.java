package abstract_factory.houseSolutionTeacher_useThis.factories;


import abstract_factory.houseSolutionTeacher_useThis.doors.Door;
import abstract_factory.houseSolutionTeacher_useThis.doors.LargeDoor;
import abstract_factory.houseSolutionTeacher_useThis.walls.GlassWall;
import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;
import abstract_factory.houseSolutionTeacher_useThis.windows.Window;
import abstract_factory.houseSolutionTeacher_useThis.windows.WindowToTheFloor;

public class GermanHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new GlassWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
