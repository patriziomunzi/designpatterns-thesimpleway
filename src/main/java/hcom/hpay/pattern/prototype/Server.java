package hcom.hpay.pattern.prototype;

/**
 * Prototype.
 * @author pmunzi
 */
public class Server {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkInterface networkInterface1 = new NetworkInterface();
        NetworkInterface networkInterface2 = new NetworkInterface();

        NetworkInterface networkInterface3 = new NetworkInterface();
        NetworkInterface networkInterface4 = networkInterface1.clone();
    }
}
