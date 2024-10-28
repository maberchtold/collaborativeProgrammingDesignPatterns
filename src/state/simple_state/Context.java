package state.simple_state;

public class Context {
    private State onState;
    private State offState;

    private State currentState;

    public Context() {
        onState = new StateOn(this);
        offState = new StateOff(this);
        currentState = offState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    public void on(){
        currentState.on();
    }

    public void off(){
        currentState.off();
    }
}
