package hcom.hpay.pattern.behavioral.observer.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class BinObserver implements Observer {

    private Subject subject;

    public BinObserver(final Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.print(Integer.toBinaryString(this.subject.getState()));
    }

}
