package hcom.hpay.pattern.structural.decorator;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ScrollableHtmlFieldDecorator extends Abstra{
    private HtmlField htmlField;

    public ScrollableHtmlFieldDecorator(HtmlField htmlField) {
        this.htmlField = htmlField;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("scrollable");
    }
}
