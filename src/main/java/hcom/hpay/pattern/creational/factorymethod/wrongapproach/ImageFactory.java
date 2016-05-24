package hcom.hpay.pattern.creational.factorymethod.wrongapproach;

/**
 * Factory Method.
 * @author pmunzi
 */
public class ImageFactory implements FileFactory {

    /**
     * injecting a complex and application wide object in
     * a specific implementation, giving an application plugin the
     * ability to break the whole framework
     */
    private Application app;

    public void open(String name) {
        File file = new Image();
        app.openTab(file);
    }
}
