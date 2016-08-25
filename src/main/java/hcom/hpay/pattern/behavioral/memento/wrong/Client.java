package hcom.hpay.pattern.behavioral.memento.wrong;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {

    private static String lastState;

    public static void main(String[] args) {
        StatefulResource statefulResource = new StatefulResource();
        statefulResource.setState("first state");

        lastState = statefulResource.getState();
        statefulResource.setState("second state");

        //roolback
        statefulResource.setState(lastState);
    }

}
