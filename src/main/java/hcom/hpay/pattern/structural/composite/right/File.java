package hcom.hpay.pattern.structural.composite.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
class File implements IFile {
    private final String name;

    File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(name);
    }
}
