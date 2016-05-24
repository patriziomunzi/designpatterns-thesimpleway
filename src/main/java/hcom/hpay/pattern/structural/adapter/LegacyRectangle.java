package hcom.hpay.pattern.structural.adapter;

/**
 * A legacy rectangle class dealing with with width and height to draw itself.
 * @author pmunzi
 */
public class LegacyRectangle {
    public void draw(int x, int y, int w, int h) {
        System.out.println("rectangle at (" + x + ',' + y + ") with width " + w + " and height " + h);
    }
}
