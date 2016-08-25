package hcom.hpay.pattern.behavioral.mediator.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Store {
    private boolean slotFull;
    private int number;

    public boolean isSlotFull() {
        return slotFull;
    }

    public void setSlotFull(final boolean slotFull) {
        this.slotFull = slotFull;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(final int number) {
        this.number = number;
    }
}
