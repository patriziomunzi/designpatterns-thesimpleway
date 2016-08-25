package hcom.hpay.pattern.behavioral.memento.right;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    private static Memento memento;

    public static void main(String[] args) {
        StatefulResource statefulResource = new StatefulResource();
        statefulResource.set("first state");

        memento = statefulResource.saveToMemento();

        statefulResource.set("second state");

        //roolback
        statefulResource.restoreFromMemento(memento);
    }

}
