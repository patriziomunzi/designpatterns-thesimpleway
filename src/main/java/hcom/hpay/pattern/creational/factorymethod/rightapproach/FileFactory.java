package hcom.hpay.pattern.creational.factorymethod.rightapproach;

/**
 * Factory Method.
 * @author pmunzi
 */
public abstract class FileFactory {
    private Application app;

    public void open(String name) {
        File file = create(name);
        app.openTab(file);
    }

    protected abstract File create(String name);
}
