package hcom.hpay.pattern.behavioral.mediator.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Consumer extends Thread {
    private static int num = 1;
    private int id;
    private Store store;

    public Consumer(final Store store) {
        id = num++;
        this.store = store;
    }

    public void run() {
        while (true) {
            System.out.print("c" + id + "-" + retrieveMessage() + "  ");
        }
    }

    public int retrieveMessage() {
        synchronized (Consumer.class) {
            // no room for another message
            while (!store.isSlotFull())
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            store.setSlotFull(false);
            notifyAll();
            return store.getNumber();
        }
    }
}
