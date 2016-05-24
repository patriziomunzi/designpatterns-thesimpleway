package hcom.hpay.pattern.structural.composite.wrong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * TODO: Document.
 * @author pmunzi
 */
class Main {

    static void main(String[] args) {
        File file1 = new File("file1");
        File file2 = new File("file2");
        List<Object> list = new ArrayList<>();
        list.add(file1);
        list.add(file2);
        Directory directory1 = new Directory(list);
        Directory directory2 = new Directory(Collections.singletonList(directory1));

        ls(directory2);

    }

    private static void ls(Directory dir) {
        for (Object file: dir.getFiles()) {
            if (file instanceof File) {
                System.out.println(((File) file).getName());
            } else {
                ls(dir);
            }
        }
    }
}
