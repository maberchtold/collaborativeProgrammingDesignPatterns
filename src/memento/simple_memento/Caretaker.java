package memento.simple_memento;

import java.util.Stack;

public class Caretaker {
    private Stack<Originator.Memento> snapshots = new Stack<>();

    public void save(Originator.Memento state) {
        snapshots.push(state);
    }

    public void restore(Originator originator) {
        if (!snapshots.isEmpty()) {
            originator.setMemento(snapshots.pop());
        }else{
            System.out.println("Cannot undo");
        }

    }
}
