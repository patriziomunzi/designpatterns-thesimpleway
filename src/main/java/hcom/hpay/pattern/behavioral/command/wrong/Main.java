package hcom.hpay.pattern.behavioral.command.wrong;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Command> queue = new ArrayBlockingQueue<Command>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        producer.run();
        consumer.run();

        producer.join();
        consumer.join();
    }
}
