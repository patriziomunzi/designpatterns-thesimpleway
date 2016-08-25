package hcom.hpay.pattern.behavioral.memento.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class StatefulResource {
    private String state;

    public void set(String state) {
        this.state = state;
    }

    public Memento saveToMemento() {
        return new Memento(state);
    }
    public void restoreFromMemento(Memento m) {
        state = m.getSavedState();
    }
}
