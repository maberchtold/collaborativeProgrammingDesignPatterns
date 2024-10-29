package abstract_factory.houseSolutionTeacher_useThis.factories;


import abstract_factory.houseSolutionTeacher_useThis.doors.Door;
import abstract_factory.houseSolutionTeacher_useThis.doors.LargeDoor;
import abstract_factory.houseSolutionTeacher_useThis.walls.BricksWall;
import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;
import abstract_factory.houseSolutionTeacher_useThis.windows.Window;
import abstract_factory.houseSolutionTeacher_useThis.windows.WindowToTheFloor;

public class DutchHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new BricksWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
