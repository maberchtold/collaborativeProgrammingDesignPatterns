package command.car_game;


import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Command> slots;
    private Command lastCommand;

    public Game() {
        slots = new ArrayList<Command>();
    }

    public void addCommand(Command command) {
        slots.add(command);
    }

    public void pushKey(int keyCode){
        slots.get(keyCode).execute();
        lastCommand = slots.get(keyCode);
    }

    public void undo(){
        lastCommand.undo();
    }
}
