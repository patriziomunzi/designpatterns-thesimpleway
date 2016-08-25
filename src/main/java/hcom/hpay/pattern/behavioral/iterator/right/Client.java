package hcom.hpay.pattern.behavioral.iterator.right;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {
    public static void main(String[] args) {
        List<IterableData> iterableDatas = new ArrayList<>();

        SomeClassWithData data1 = new SomeClassWithData();
        data1.add(1);
        data1.add(2);
        iterableDatas.add(data1);

        SomeOtherClassWithData data2 = new SomeOtherClassWithData();
        data2.add(1);
        data2.add(2);
        iterableDatas.add(data2);

        for (IterableData iterableData: iterableDatas) {
            Iterator<Integer> iterator = iterableData.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

    }
}
