package hcom.hpay.pattern.behavioral.iterator.right;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class SomeOtherClassWithData implements IterableData {

    private Integer[] data = new Integer[100000];
    private AtomicInteger index = new AtomicInteger(0);

    public void add(int in) {
        data[index.getAndAdd(1)] = in;
    }

    public Iterator<Integer> iterator() {
        return Arrays.asList(data).iterator();
    }
}
