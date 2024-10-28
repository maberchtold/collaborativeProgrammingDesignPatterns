package abstract_factory.extendingTheHouse;


import abstract_factory.extendingTheHouse.house.BricksHouse;
import abstract_factory.extendingTheHouse.house.GlassHouse;
import abstract_factory.extendingTheHouse.house.House;
import abstract_factory.extendingTheHouse.house.WoodHouse;

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
