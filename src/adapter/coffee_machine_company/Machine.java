package adapter.coffee_machine_company;

public interface Machine {
    int getNumberOfCapsules();
    boolean isCompletelyUp();
    void stop();
    Engineer getEngineer();
}
