package factory.architect_of_houses.house;


import factory.architect_of_houses.wall.GlassWall;
import factory.architect_of_houses.wall.Wall;

public class GlassHouse extends House {
    
    public GlassHouse() {
        this.name = "Moder German house";
    }

    @Override
    protected Wall createWall() {
        return new GlassWall();
    }
    
}
