package flyweight.dungeonAndDragons.Flyweight;
public class Creature implements Character {
    private String race;
    private String skinColor;
    private String hairColor;
    private String eyesColor;

    public Creature(String race, String skinColor, String hairColor, String eyesColor) {
        this.race = race;
        this.skinColor = skinColor;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
    }

    public void fightWithWeapon(String weapon) {
        System.out.println(this + " uses weapon " + weapon);
    }

    @Override
    public String toString(){
        return race + " " + this.hashCode() + " (skin:" + skinColor + " hair:" + hairColor + " eyes:" + eyesColor + ")";
    }
}
