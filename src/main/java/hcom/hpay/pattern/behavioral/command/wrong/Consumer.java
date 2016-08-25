package hcom.hpay.pattern.behavioral.command.wrong;

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
                switch (command) {
                case Politician:
                    System.out.println("take money from the rich, take votes from the poor");
                    break;
                case DomesticEngineer:
                    System.out.println("take out the trash");
                    break;
                case Programmer:
                    System.out.println("sell the bugs, charge extra for the fixes");
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
