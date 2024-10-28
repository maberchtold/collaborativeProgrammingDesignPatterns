package factory.architect_of_houses;


import factory.architect_of_houses.house.BricksHouse;
import factory.architect_of_houses.house.GlassHouse;
import factory.architect_of_houses.house.House;
import factory.architect_of_houses.house.WoodHouse;


public class ArchitectOffice {
    public static void main(String[] args) {
        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();
    }
}
