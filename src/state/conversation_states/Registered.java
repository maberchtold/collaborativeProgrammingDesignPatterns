package state.conversation_states;

public class Registered implements State{
    private Person person;

    public Registered(Person person) {
        this.person = person;
    }

    @Override
    public void leave() {
        System.out.println("no state transition");
    }

    @Override
    public void enter() {
        person.setCurrentState(person.getInMeeting());
        System.out.println("Transition to state inMeeting");
    }

    @Override
    public void over() {
        System.out.println("no state transition");
    }

    @Override
    public void ask() {
        System.out.println("no state transition");
    }

    @Override
    public void handOver() {
        System.out.println("no state transition");
    }
}
