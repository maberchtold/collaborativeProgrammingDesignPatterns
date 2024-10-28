package state.conversation_states;

public class Speaking implements State {

    private Person person;

    public Speaking(Person person) {
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
        person.setCurrentState(person.getInMeeting());
        System.out.println("Transition to state InMeeting");
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
