package adapter.coffeMachineSolutionTeacher_useThis;

public class Engineer {
    private String name;

    public Engineer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engineer " + name;
    }
}
