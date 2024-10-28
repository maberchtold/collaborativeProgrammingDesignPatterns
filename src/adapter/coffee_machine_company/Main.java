package adapter.coffee_machine_company;

public class Main {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("Matteo");
        Engineer engineer2 = new Engineer("Elia");
        Engineer engineer3 = new Engineer("Vuk");

        NewMachine newMachine1 = new NewMachine(30, true, engineer1);
        NewMachine newMachine2 = new NewMachine(20, true, engineer2);
        NewMachine newMachine3 = new NewMachine(40, true, engineer3);

        // Create old machine and wrap it with an adapter
        OldMachine oldMachine = new OldMachine(80, true);
        Machine oldMachineAdapter = new OldMachineAdapter(oldMachine);

        // Print information for new machines
        printMachineInfo(newMachine1);
        printMachineInfo(newMachine2);
        printMachineInfo(newMachine3);

        // Print information for old machine (using adapter)
        printMachineInfo(oldMachineAdapter);
    }

    public static void printMachineInfo(Machine machine) {
        System.out.println("Machine " + machine.hashCode() +
                " is currently processing " + machine.getNumberOfCapsules() +
                " capsules, supervised by " + machine.getEngineer());
    }
}
