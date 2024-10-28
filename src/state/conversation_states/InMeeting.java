package state.conversation_states;

public class InMeeting implements State{

    private Person person;

    public InMeeting(Person person) {
        this.person = person;
    }

    @Override
    public void leave() {
        person.setCurrentState(person.getRegistered());
        System.out.println("Transition To state Registered");
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
        person.setCurrentState(person.getWaitingToSpeak());
        System.out.println("Transition To state WaitingToSpeak");
    }

    @Override
    public void handOver() {
        System.out.println("no state transition");
    }
}
