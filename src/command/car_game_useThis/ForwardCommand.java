package command.car_game_useThis;

public class ForwardCommand implements Command {
    private Car car;

    public ForwardCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.forward();
    }

    @Override
    public void undo() {
        car.backward();
    }
}
