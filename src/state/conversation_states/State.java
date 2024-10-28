package state.conversation_states;

public interface State {
    void leave();
    void enter();
    void over();
    void ask();
    void handOver();
}
