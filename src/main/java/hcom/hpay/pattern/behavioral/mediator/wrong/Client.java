package hcom.hpay.pattern.behavioral.mediator.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    public static void main(String[] args) {
        Store store = new Store();
        new Producer(store).start();
        new Producer(store).start();
        new Consumer(store).start();
        new Consumer(store).start();
        new Consumer(store).start();
        new Consumer(store).start();
    }
}
