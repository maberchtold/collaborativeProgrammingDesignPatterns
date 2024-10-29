package state.conversation_states_useThis;

public class WaitingToSpeak implements State {

    private Person person;

    public WaitingToSpeak(Person person) {
        this.person = person;
    }

    @Override
    public void leave() {
        person.setCurrentState(person.getRegistered());
        System.out.println("Transition to state Registered");
    }

    @Override
    public void enter() {
        System.out.println("no state transition");
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
        person.setCurrentState(person.getSpeaking());
        System.out.println("Transition to state Speaking");
    }
}
