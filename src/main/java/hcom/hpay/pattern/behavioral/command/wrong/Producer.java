package hcom.hpay.pattern.behavioral.command.wrong;

import java.util.concurrent.BlockingQueue;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Producer extends Thread {

    private BlockingQueue<Command> queue;

    Producer(final BlockingQueue<Command> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        queue.add(Command.DomesticEngineer);
        queue.add(Command.Programmer);
        queue.add(Command.Politician);
    }
}
