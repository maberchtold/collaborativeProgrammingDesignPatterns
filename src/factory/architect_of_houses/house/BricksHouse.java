package factory.architect_of_houses.house;


import factory.architect_of_houses.wall.BricksWall;
import factory.architect_of_houses.wall.Wall;

public class BricksHouse extends House {
    
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}
