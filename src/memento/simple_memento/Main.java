package memento.simple_memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("blue");
        originator.setState("red");
        originator.setState("green");
        caretaker.save(originator.createMemento());
        originator.setState("yellow");
        System.out.println(originator.getState());
        caretaker.restore(originator);
        System.out.println(originator.getState());
    }
}
