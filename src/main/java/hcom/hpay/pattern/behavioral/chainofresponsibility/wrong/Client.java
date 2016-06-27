package hcom.hpay.pattern.behavioral.chainofresponsibility.wrong;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {
    public static void main(String[] args) {
        Filter[] filters = {
            new PassThroughFilter(), new BlockingFilter(), new PassThroughFilter()
        };
        Request request = new Request();
        for (Filter filter: filters) {
            boolean exit = filter.doFilter(request);
            if (exit) {
                break;
            }
        }
    }
}
