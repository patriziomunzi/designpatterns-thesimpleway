package hcom.hpay.pattern.behavioral.iterator.wrong;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class SomeClassWithData {

    private List<Integer> data = new ArrayList<>();

    public void add(int in) {
        data.add(in);
    }

    public List<Integer> getData() {
        return data;
    }
}
