package factory.architect_of_houses.house;


import factory.architect_of_houses.wall.Wall;
import factory.architect_of_houses.wall.WoodWall;

public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
