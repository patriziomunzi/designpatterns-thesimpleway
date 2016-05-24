package hcom.hpay.pattern.structural.bridge.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Circle extends AbstractShape {

    public Circle(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        getDrawingAPI().drawCircle();
    }
}
