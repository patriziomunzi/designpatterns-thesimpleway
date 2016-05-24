package hcom.hpay.pattern.structural.decorator;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ScrollableHtmlFieldDecorator implements HtmlField {
    private HtmlField htmlField;

    public ScrollableHtmlFieldDecorator(HtmlField htmlField) {
        this.htmlField = htmlField;
    }

    @Override
    public void draw() {
        System.out.println("scrollable");
    }
}
