package hcom.hpay.pattern.singleton;

/**
 * Singleton.
 * @author pmunzi
 */
public final class Singleton {

    private static Singleton instance;

    private String attr1;
    private String attr2;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();
        return instance;
    }

    public void method1() {}

    public void method2() {}

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }
}
