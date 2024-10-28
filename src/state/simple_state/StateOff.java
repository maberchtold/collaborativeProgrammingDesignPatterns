package state.simple_state;

public class StateOff implements State {
    private Context context;

    public StateOff(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        context.setCurrentState(context.getOnState());
        System.out.println("Transition to on");
    }

    @Override
    public void off() {
        System.out.println("No state transition");
    }
}
