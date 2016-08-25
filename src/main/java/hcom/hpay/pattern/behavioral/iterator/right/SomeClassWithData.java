package hcom.hpay.pattern.behavioral.iterator.right;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class SomeClassWithData implements IterableData {

    private List<Integer> data = new ArrayList<>();

    public void add(int in) {
        data.add(in);
    }

    public Iterator<Integer> iterator() {
        return data.iterator();
    }
}
