package hcom.hpay.pattern.factory;

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
