package hcom.hpay.pattern.behavioral.mediator.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    public static void main(String[] args) {
        Mediator mb = new Mediator();
        new Producer(mb).start();
        new Producer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
        new Consumer(mb).start();
    }

}
