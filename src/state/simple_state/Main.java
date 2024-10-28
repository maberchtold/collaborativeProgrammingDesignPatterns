package state.simple_state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.off();
        context.on();
        context.on();
        context.off();
    }
}
