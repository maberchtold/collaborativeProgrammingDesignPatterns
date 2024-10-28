package command.simple_command;

public class Invoker {
    private Command slot;

    public Invoker(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPushed(){
        slot.execute();
    }

    public void setCommand(Command slot) {
        this.slot = slot;
    }
}
