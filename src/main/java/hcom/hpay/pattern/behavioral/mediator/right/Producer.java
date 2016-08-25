package hcom.hpay.pattern.behavioral.mediator.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Producer extends Thread {
    private static int num = 1;

    private Mediator med;
    private int    id;

    public Producer(Mediator m) {
        med = m;
        id = num++;
    }
    public void run() {
        int num;
        while (true) {
            med.storeMessage(num = (int) (Math.random() * 100));
            System.out.print("p" + id + "-" + num + "  ");
        }
    }
}
