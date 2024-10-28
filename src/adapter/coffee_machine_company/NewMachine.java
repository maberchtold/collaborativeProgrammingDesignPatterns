package adapter.coffee_machine_company;

public class NewMachine implements Machine {
    int capsules;
    boolean isCompletelyUp;
    Engineer engineer;

    public NewMachine(int capsules, boolean isCompletelyUp, Engineer engineer) {
        this.capsules = capsules;
        this.isCompletelyUp = isCompletelyUp;
        this.engineer = engineer;
    }

    @Override
    public int getNumberOfCapsules() {
        return capsules;
    }

    @Override
    public boolean isCompletelyUp() {
        return isCompletelyUp;
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Machine");
    }

    @Override
    public Engineer getEngineer() {
        return engineer;
    }
}
