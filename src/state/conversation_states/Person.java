package state.conversation_states;

public class Person {
    private State registered;
    private State inMeeting;
    private State speaking;
    private State waitingToSpeak;

    private State currentState;

    public Person() {
        this.registered = new Registered(this);
        this.inMeeting = new InMeeting(this);
        this.speaking = new Speaking(this);
        this.waitingToSpeak = new WaitingToSpeak(this);

        this.currentState = registered;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getRegistered() {
        return registered;
    }

    public void setRegistered(State registered) {
        this.registered = registered;
    }

    public State getInMeeting() {
        return inMeeting;
    }

    public void setInMeeting(State inMeeting) {
        this.inMeeting = inMeeting;
    }

    public State getSpeaking() {
        return speaking;
    }

    public void setSpeaking(State speaking) {
        this.speaking = speaking;
    }

    public State getWaitingToSpeak() {
        return waitingToSpeak;
    }

    public void setWaitingToSpeak(State waitingToSpeak) {
        this.waitingToSpeak = waitingToSpeak;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void leave(){
        currentState.leave();
    }

    public void enter(){
        currentState.enter();
    }

    public void over(){
        currentState.over();
    }

    public void ask(){
        currentState.ask();
    }

    public void handOver(){
        currentState.handOver();
    }
}
