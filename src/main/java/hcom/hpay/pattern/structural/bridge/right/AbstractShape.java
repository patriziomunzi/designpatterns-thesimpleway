package hcom.hpay.pattern.structural.bridge.right;

import hcom.hpay.pattern.structural.bridge.Shape;

/**
 * TODO: Document.
 * @author pmunzi
 */
public abstract class AbstractShape implements Shape {
    private final DrawingAPI drawingAPI;

    public AbstractShape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public DrawingAPI getDrawingAPI() {
        return drawingAPI;
    }
}
