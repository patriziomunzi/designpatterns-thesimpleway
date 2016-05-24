package hcom.hpay.pattern.structural.composite.wrong;

import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
class Directory {
    private final List<Object> files;

    Directory(List<Object> files) {
        this.files = files;
    }

    List<Object> getFiles() {
        return files;
    }
}
