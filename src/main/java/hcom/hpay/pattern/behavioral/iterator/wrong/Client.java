package hcom.hpay.pattern.behavioral.iterator.wrong;

import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {
    public static void main(String[] args) {
        SomeClassWithData data1 = new SomeClassWithData();
        data1.add(1);
        data1.add(2);

        SomeOtherClassWithData data2 = new SomeOtherClassWithData();
        data2.add(1);
        data2.add(2);

        List<Integer> data1Content = data1.getData();
        for (int i = 0; i < data1Content.size(); i++) {
            System.out.println(data1Content.get(i));
        }
        data1Content.clear();

        Integer[] data2Content = data2.getData();
        for (int i = 0; i < data2Content.length; i++) {
            System.out.println(data2Content[i]);
        }

    }
}
