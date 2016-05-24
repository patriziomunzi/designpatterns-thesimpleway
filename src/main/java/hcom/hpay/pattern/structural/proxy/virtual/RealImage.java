package hcom.hpay.pattern.structural.proxy.virtual;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        // Potentially expensive operation
        // ...
        System.out.println("Loading   " + filename);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void displayImage() { System.out.println("Displaying " + filename); }
}
