package command.car_game_useThis;

public class TurnLeftCommand implements Command {
    private Car car;

    public TurnLeftCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnLeft();
    }

    @Override
    public void undo() {
        car.turnRight();
    }
}
