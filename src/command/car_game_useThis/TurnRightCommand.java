package command.car_game_useThis;

public class TurnRightCommand implements Command {
    private Car car;

    public TurnRightCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.turnRight();
    }

    @Override
    public void undo() {
        car.turnLeft();
    }
}
