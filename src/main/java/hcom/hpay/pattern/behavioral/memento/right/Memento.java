package hcom.hpay.pattern.behavioral.memento.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Memento {
    private String state;

    public Memento(String stateToSave) { state = stateToSave; }
    public String getSavedState() { return state; }
}
