package hcom.hpay.pattern.behavioral.observer.right;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(final Observer o) {
        observers.add(o);
    }

    public int getState() {
        return state;
    }

    public void setState(final int in) {
        state = in;
        notifyObserver();
    }

    private void notifyObserver() {
        observers.forEach(Observer::update);
    }

}
