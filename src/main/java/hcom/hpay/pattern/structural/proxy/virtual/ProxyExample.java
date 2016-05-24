package hcom.hpay.pattern.structural.proxy.virtual;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ProxyExample {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");

        image1.displayImage(); // loading necessary
        image2.displayImage(); // loading necessary
        image1.displayImage(); // no loading necessary; already done
        image2.displayImage(); // no loading necessary; already done
        image3.displayImage(); // loading necessary
    }
}

