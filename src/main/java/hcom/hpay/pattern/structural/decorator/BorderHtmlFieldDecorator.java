package hcom.hpay.pattern.structural.decorator;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class BorderHtmlFieldDecorator implements HtmlField {

    private HtmlField htmlField;

    public BorderHtmlFieldDecorator(HtmlField htmlField) {
        this.htmlField = htmlField;
    }

    @Override
    public void draw() {
        System.out.println("with borders");
    }
}
