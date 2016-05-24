package hcom.hpay.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Menu {
    private final Map<String, CoffeeFlavour> flavours = new HashMap<>();

    CoffeeFlavour lookup(String flavourName) {
        CoffeeFlavour flavour = flavours.get(flavourName);
        if (flavour == null) {
            flavour = new CoffeeFlavour(flavourName);
            flavours.put(flavourName, flavour);
        }
        return flavour;
    }

    public int totalCoffeeFlavoursMade() {
        return flavours.size();
    }
}
