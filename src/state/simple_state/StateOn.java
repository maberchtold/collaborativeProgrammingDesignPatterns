package state.simple_state;

public class StateOn implements State {
    private Context context;

    public StateOn(Context context) {
        this.context = context;
    }

    @Override
    public void on() {
        System.out.println("No transition done");
    }

    @Override
    public void off() {
        context.setCurrentState(context.getOffState());
        System.out.println("Trasitioning to off state");
    }
}
