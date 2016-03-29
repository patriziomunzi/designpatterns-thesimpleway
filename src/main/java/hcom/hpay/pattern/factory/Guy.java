package hcom.hpay.pattern.factory;

/**
 * Factory Pattern.
 * @author pmunzi
 */
@SuppressWarnings("unused")
public class Guy {

    public void chill(int deviceType, String songName) {
        Device device;
        if (deviceType == 1) {
            device = new Tape();
        } else if (deviceType == 2){
            device = new iPod();
        } else {
            throw new IllegalArgumentException("Invalid device type");
        }
        device.play(songName);
    }

    public void reallyChill(
        DeviceFactory deviceFactory,
        String songName) {

        Device device = deviceFactory.create();
        device.play(songName);
    }

}
