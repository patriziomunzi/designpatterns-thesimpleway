package hcom.hpay.pattern.behavioral.iterator.wrong;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class SomeOtherClassWithData {

    private Integer[] data = new Integer[100000];
    private AtomicInteger index = new AtomicInteger(0);

    public void add(int in) {
        data[index.getAndAdd(1)] = in;
    }

    public Integer[] getData() {
        return data;
    }
}
