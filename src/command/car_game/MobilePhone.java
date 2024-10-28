package command.car_game;

public class MobilePhone {
    public static void main(String[] args) {
        Game game = new Game();

        Car car = new Car();

        ForwardCommand fc = new ForwardCommand(car);
        BackwardCommand bc = new BackwardCommand(car);
        TurnLeftCommand tl = new TurnLeftCommand(car);
        TurnRightCommand tr = new TurnRightCommand(car);

        game.addCommand(fc);
        game.addCommand(bc);
        game.addCommand(tl);
        game.addCommand(tr);

        game.pushKey(0);
        game.pushKey(1);
        game.pushKey(2);
        game.pushKey(3);
        game.undo();
    }
}
