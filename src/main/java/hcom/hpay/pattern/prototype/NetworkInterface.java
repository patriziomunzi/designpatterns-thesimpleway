package hcom.hpay.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype.
 * @author pmunzi
 */
public class NetworkInterface implements Cloneable {
    private List<String> availableIntranetIP = new ArrayList<>();

    public NetworkInterface() {
        IntranetService.scanAllAvailableIP();
    }

    @Override
    protected NetworkInterface clone() throws CloneNotSupportedException {
        NetworkInterface clonedObject = (NetworkInterface) super.clone();
        clonedObject.availableIntranetIP = this.availableIntranetIP;
        return clonedObject;
    }
}
