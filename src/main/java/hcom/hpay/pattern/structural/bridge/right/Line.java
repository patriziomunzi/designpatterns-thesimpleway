package hcom.hpay.pattern.structural.bridge.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Line extends AbstractShape {

    public Line(DrawingAPI drawingAPI) {
        super(drawingAPI);
    }

    @Override
    public void draw() {
        getDrawingAPI().drawLIne();
    }
}
