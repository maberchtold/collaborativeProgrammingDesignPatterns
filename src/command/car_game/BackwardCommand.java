package command.car_game;

public class BackwardCommand implements Command {
    private Car car;

    public BackwardCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.backward();
    }

    @Override
    public void undo() {
        car.forward();
    }
}
