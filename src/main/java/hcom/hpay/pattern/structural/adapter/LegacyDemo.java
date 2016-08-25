package hcom.hpay.pattern.structural.adapter;

/**
 * Wrong Producer.
 * @author pmunzi
 */
public class LegacyDemo {

    public static void main(String[] args) {
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 60;

        LegacyRectangle legacyRectangle = new LegacyRectangle();
        legacyRectangle.draw(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
    }
}
