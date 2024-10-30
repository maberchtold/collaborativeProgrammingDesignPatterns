package flyweight.dungeonAndDragons.Flyweight;
public class Wizard implements Character {
    @Override
    public void fightWithWeapon(String weapon) {
        System.out.println("Wizard " + this.hashCode() + " uses weapon " + weapon + " and the battle is finished -----");
    }
}
