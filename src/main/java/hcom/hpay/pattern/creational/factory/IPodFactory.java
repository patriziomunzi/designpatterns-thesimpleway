package hcom.hpay.pattern.creational.factory;

/**
 * Factory Pattern.
 * @author pmunzi
 */
public class IPodFactory implements DeviceFactory {

    @Override
    public Device create() {
        return new IPod();
    }
}
