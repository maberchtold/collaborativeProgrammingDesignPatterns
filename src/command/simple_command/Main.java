package command.simple_command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.buttonWasPushed();


        invoker.setCommand(new ConcreteCommand2(receiver));
        invoker.buttonWasPushed();

    }
}
