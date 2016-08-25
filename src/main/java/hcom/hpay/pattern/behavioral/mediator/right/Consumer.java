package hcom.hpay.pattern.behavioral.mediator.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Consumer extends Thread {
    private static int num = 1;

    private Mediator med;
    private int id;

    public Consumer(Mediator m) {
        med = m;
        id = num++;
    }

    public void run() {
        while (true) {
            System.out.print("c" + id + "-" + med.retrieveMessage() + "  ");
        }
    }
}
