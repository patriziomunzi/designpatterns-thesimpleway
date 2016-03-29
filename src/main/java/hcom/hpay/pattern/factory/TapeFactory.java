package hcom.hpay.pattern.factory;

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
