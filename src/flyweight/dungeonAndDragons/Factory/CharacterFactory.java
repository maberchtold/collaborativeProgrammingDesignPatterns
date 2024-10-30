package flyweight.dungeonAndDragons.Factory;



import flyweight.dungeonAndDragons.Flyweight.Creature;
import flyweight.dungeonAndDragons.Flyweight.Character;

import java.util.HashMap;

public class CharacterFactory {

    private static HashMap<String, Character> characterHashMap = new HashMap<>();

    public static Character getCharacter(String race, String skinColor, String hairColor, String eyesColor)
    {
        String key = race + skinColor + hairColor + eyesColor;
        Character character = characterHashMap.get(key);
        if (character == null) {
            /* create an object for the specific appearance  */
            character = new Creature(race, skinColor, hairColor, eyesColor);
            // Once created insert it into the HashMap
            characterHashMap.put(key, character);
        }
        return character;
    }

    public static HashMap<String, Character> getCharacterHashMap() {
        return characterHashMap;
    }
}
