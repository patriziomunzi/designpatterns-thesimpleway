package hcom.hpay.pattern.behavioral.observer.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class HexObserver implements Observer {

    private Subject subject;

    public HexObserver(final Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.print(Integer.toHexString(this.subject.getState()));
    }
}
