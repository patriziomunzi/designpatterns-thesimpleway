package hcom.hpay.pattern.structural.composite.right;

import java.util.List;

/**
 * TODO: Document.
 * @author pmunzi
 */
class Directory implements IFile {
    private final List<IFile> files;

    Directory(List<IFile> files) {
        this.files = files;
    }

    public void ls() {
        for (IFile iFile: files) {
            iFile.ls();
        }
    }
}
