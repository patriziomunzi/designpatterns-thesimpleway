package hcom.hpay.pattern.creational.factory;

/**
 * Factory Pattern.
 * @author pmunzi
 */
public class TapeFactory implements DeviceFactory {
    @Override
    public Device create() {
        return new Tape();
    }
}
