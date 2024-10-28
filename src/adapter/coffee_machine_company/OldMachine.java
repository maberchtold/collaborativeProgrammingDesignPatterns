package adapter.coffee_machine_company;

public class OldMachine {
    int capsules;
    boolean isCompletelyUp;
    Engineer engineer;

    public OldMachine(int capsules, boolean isCompletelyUp) {
        this.capsules = capsules;
        this.isCompletelyUp = isCompletelyUp;
        this.engineer = engineer;
    }

    public int getNumberOfCapsules() {
        return capsules;
    }

    public boolean isCompletelyUp() {
        return isCompletelyUp;
    }

    public void stop() {
        System.out.println("Stopping the Machine");
    }

}
