package hcom.hpay.pattern.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Separate the construction of a complex object from its representation so that the same construction process can
 * create different representations.
 * Benefits:
 * - Allow expressive and fluid interface
 * - complexity encapsulation
 * When:
 * - The builder pattern is a good choice when designing classes whose constructors or static
 *   factories would have more than a handful of parameters (Joshua Bloch states in Effective Java, 2nd Edition)
 *
 * @author pmunzi
 */
public final class Hamburger {
    private final boolean ketchup;
    private final boolean mayonaise;
    private final boolean salad;
    private final boolean tomato;
    private final String clientName;

    private Hamburger(boolean ketchup, boolean mayonaise, boolean salad, boolean tomato, String clientName) {
        this.ketchup = ketchup;
        this.mayonaise = mayonaise;
        this.salad = salad;
        this.tomato = tomato;
        this.clientName = clientName;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMayonaise() {
        return mayonaise;
    }

    public boolean isSalad() {
        return salad;
    }

    public boolean isTomato() {
        return tomato;
    }

    public String getClientName() {
        return clientName;
    }

    public static class Builder {
        private boolean ketchup;
        private boolean mayonaise;
        private boolean salad;
        private boolean tomato;
        private String clientName;

        Builder withKetchup() {
            this.ketchup = true;
            return this;
        }

        Builder withMayonaise() {
            this.mayonaise = true;
            return this;
        }

        Builder withSalad() {
            this.salad = true;
            return this;
        }

        Builder withTomato() {
            this.tomato = true;
            return this;
        }

        /**
         * super complex operation
         */
        Builder withClientName(final String clientName) {
            List<String> names = new ArrayList<String>();
            names.add(clientName);
            this.clientName = names.stream().map(String::trim).collect(Collectors.toList()).get(0);
            return this;
        }

        Hamburger build() {
            return new Hamburger(ketchup, mayonaise, salad, tomato, clientName);
        }
    }

    public static class Main {
        @SuppressWarnings("unused")
        public static void main(String[] args) {

            // what are these meaningless params???
            Hamburger badHamburger = new Hamburger(
                true,
                true,
                false,
                false,
                "Patrizio");

            // lets use a builder
            Hamburger goodHamburger = new Hamburger.Builder()
                .withKetchup()
                .withMayonaise()
                .withSalad()
                .withClientName("Patrizio")
                .build();
        }
    }
}
