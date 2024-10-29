package abstract_factory.houseSolutionTeacher_useThis.factories;


import abstract_factory.houseSolutionTeacher_useThis.doors.Door;
import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;
import abstract_factory.houseSolutionTeacher_useThis.windows.Window;

public interface HouseFactory {

    public Wall createWall();
    public Door createDoor();
    public Window createWindow();

}
