package abstract_factory.houseSolutionTeacher_useThis;


import abstract_factory.houseSolutionTeacher_useThis.client.House;
import abstract_factory.houseSolutionTeacher_useThis.factories.DutchHouseFactory;
import abstract_factory.houseSolutionTeacher_useThis.factories.GermanHouseFactory;
import abstract_factory.houseSolutionTeacher_useThis.factories.SwissWoodChaletFactory;

public class ArchitectOffice {

    public static void main(String[] args) {
        House house1 = new House("Moder German house",
                new GermanHouseFactory());
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new House("Typical dutch house",
                new DutchHouseFactory());
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new House("Swiss wood chalet",
                new SwissWoodChaletFactory());
        house3.buildHouse();
        house3.calculatePrice();
    }
}
