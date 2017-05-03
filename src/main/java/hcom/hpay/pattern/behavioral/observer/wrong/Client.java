package hcom.hpay.pattern.behavioral.observer.wrong;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    private static List<Observer> observers = new ArrayList<>();

    private static int state;

    public static void main(String[] args) {
        observers.add(new BinObserver());
        observers.add(new HexObserver());

        state = 1;

        observers.forEach(observer -> observer.update(state));

        state = 2;

        observers.forEach(observer -> observer.update(state));
    }
}
