package flyweight.dungeonAndDragons.Client;



import flyweight.dungeonAndDragons.Factory.CharacterFactory;
import flyweight.dungeonAndDragons.Flyweight.Wizard;
import flyweight.dungeonAndDragons.Flyweight.Character;

import java.util.Random;

public class Battle {
    private static String[] races = {"Elf", "Orc"};
    private static String[] colors = {"green", "red"};
    private static String[] weapons = {"Bow&Arrow", "Axe", "Sword&Shield"};
    private static Random rand = new Random();

    public void start() {
        /**
         * Here we are simulating the creation of different creatures in the battle.
         * Note that the creature is composed of its skin,eyes and hair colors as well as its race.
         * As we have 2 different colors and 2 different races, the total number of possible appearance is:
         * 2 (races) * 2 (eyes color) * 2 (skin colors) * 2 (hair colors) => 16
         * We should create at least 17 players to be sure to see the effect of flyweight pattern.
         * (we show the object instances with the has values)
         *
         * To better understand the effect of flyweight, you can run several times the program creating 200 players.
         * You will see in the output that the number of appearance never exceed 16.
         */
        for (int i = 0; i < 5000; i++) {
            // Get a creature with randomly appearance
            Character creature = CharacterFactory.getCharacter(getRandRace(), getRandColor(), getRandColor(), getRandColor());
            creature.fightWithWeapon(getRandWeapon());
        }

        Character wizard = new Wizard();
        wizard.fightWithWeapon("Magic staff");

        System.out.println("Number of creatures stored: " + CharacterFactory.getCharacterHashMap().keySet().size());
    }

    public static String getRandWeapon() {
        return weapons[rand.nextInt(weapons.length)];
    }

    public static String getRandColor() {
        return colors[rand.nextInt(colors.length)];
    }

    public static String getRandRace() {
        return races[rand.nextInt(races.length)];
    }
}