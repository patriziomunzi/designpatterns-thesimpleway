package hcom.hpay.pattern.behavioral.mediator.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Producer extends Thread {
    private static int num = 1;
    private int id;
    private Store store;

    public Producer(final Store store) {
        id = num++;
        this.store = store;
    }

    public void run() {
        int num;
        while (true) {
            storeMessage(num = (int) (Math.random() * 100));
            System.out.print("p" + id + "-" + num + "  ");
        }
    }

    public void storeMessage(final int num) {
        synchronized (Producer.class) {
            // no room for another message
            while (store.isSlotFull()) {
                try {
                    wait();
                }
                catch (InterruptedException e) { }
            }
            store.setSlotFull(true);
            store.setNumber(num);
            notifyAll();
        }
    }

}
