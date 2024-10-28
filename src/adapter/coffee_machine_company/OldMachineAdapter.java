package adapter.coffee_machine_company;

public class OldMachineAdapter implements Machine {
    OldMachine oldMachine;
    public OldMachineAdapter(OldMachine machine) {
        oldMachine = machine;
    }

    public int getNumberOfCapsules() {
        return oldMachine.getNumberOfCapsules();
    }

    @Override
    public boolean isCompletelyUp() {
        return oldMachine.isCompletelyUp();
    }

    @Override
    public void stop() {
        oldMachine.stop();
    }

    @Override
    public Engineer getEngineer() {
        return null;  // Old machines do not have engineers
    }
}
