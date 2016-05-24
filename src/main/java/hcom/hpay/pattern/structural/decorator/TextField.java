package hcom.hpay.pattern.structural.decorator;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class TextField implements HtmlField {
    private final int width;
    private final int height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Text Field (" + width + ", " + height + ")");
    }
}
