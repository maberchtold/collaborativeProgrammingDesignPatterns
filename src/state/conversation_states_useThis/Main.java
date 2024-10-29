package state.conversation_states_useThis;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.enter();
        person.ask();
        person.handOver();
        person.over();
        person.ask();
        person.handOver();
        person.leave();
        person.leave();
    }
}
