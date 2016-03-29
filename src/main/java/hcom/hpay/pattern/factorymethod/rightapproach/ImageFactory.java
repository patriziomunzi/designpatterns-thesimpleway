package hcom.hpay.pattern.factorymethod.rightapproach;

/**
 * Factory Method.
 * @author pmunzi
 */
public class ImageFactory extends FileFactory {

    @Override
    protected Image create(String name) {
        return new Image();
    }
}
