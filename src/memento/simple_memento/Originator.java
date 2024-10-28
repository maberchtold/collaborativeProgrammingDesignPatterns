package memento.simple_memento;

public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void setMemento(Memento memento) {
        this.state = memento.getSavedState();
    }

    public class Memento{
        private final String state;

        public Memento(String stateToSave) {
            this.state = stateToSave;
        }

        public String getSavedState() {
            return state;
        }
    }
}
