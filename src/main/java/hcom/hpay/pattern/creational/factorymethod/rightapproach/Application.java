package hcom.hpay.pattern.creational.factorymethod.rightapproach;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory Method.
 * @author pmunzi
 */
public class Application {
    private final Map<File, Tab> tabs = new HashMap<>();

    public void openTab(File file) {
        tabs.put(file, new Tab());
    }

    public void closeTab(File file) {
        tabs.put(file, new Tab());
    }

    private class Tab {
    }
}
