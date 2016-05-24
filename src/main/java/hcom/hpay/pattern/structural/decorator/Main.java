package hcom.hpay.pattern.structural.decorator;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Main {

    public static void main(String[] args) {
        HtmlField htmlField = new BorderHtmlFieldDecorator(
            new BorderHtmlFieldDecorator(
                new ScrollableHtmlFieldDecorator(
                    new TextField(10, 10)
                )
            )
        );
        htmlField.draw();
    }
}
