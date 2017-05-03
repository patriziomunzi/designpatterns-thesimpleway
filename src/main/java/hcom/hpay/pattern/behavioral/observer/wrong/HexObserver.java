package hcom.hpay.pattern.behavioral.observer.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class HexObserver implements Observer {

    public void update(final int state) {
        System.out.println("state = [" + state + "]");
    }
}
