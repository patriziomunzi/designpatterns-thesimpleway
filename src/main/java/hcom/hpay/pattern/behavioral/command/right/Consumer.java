package hcom.hpay.pattern.behavioral.command.right;

import java.util.concurrent.BlockingQueue;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Consumer extends Thread {

    private BlockingQueue<Command> queue;

    Consumer(final BlockingQueue<Command> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            Command command = null;
            try {
                command = queue.take();
                command.execute();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
