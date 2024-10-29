package abstract_factory.houseSolutionTeacher_useThis.factories;


import abstract_factory.houseSolutionTeacher_useThis.doors.Door;
import abstract_factory.houseSolutionTeacher_useThis.doors.ThinDoor;
import abstract_factory.houseSolutionTeacher_useThis.walls.Wall;
import abstract_factory.houseSolutionTeacher_useThis.walls.WoodWall;
import abstract_factory.houseSolutionTeacher_useThis.windows.Window;
import abstract_factory.houseSolutionTeacher_useThis.windows.WindowWithStructure;

public class SwissWoodChaletFactory implements HouseFactory {

    public Wall createWall() {
        return new WoodWall();
    }

    public Door createDoor() {
        return new ThinDoor();
    }

    public Window createWindow() {
        return new WindowWithStructure();
    }

}
