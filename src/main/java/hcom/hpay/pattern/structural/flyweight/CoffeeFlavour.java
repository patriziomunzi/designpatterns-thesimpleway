package hcom.hpay.pattern.structural.flyweight;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class CoffeeFlavour {
    private String name;

    public CoffeeFlavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoffeeFlavour{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }
}
