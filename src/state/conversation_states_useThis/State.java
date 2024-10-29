package state.conversation_states_useThis;

public interface State {
    void leave();
    void enter();
    void over();
    void ask();
    void handOver();
}
