package hcom.hpay.pattern.behavioral.chainofresponsibility.right;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class Client {
    public static void main(String[] args) {
        Filter head = new ChainFilter();
        head.add(new PassThroughFilter());
        head.add(new BlockingFilter());

        Request request = new Request();
        head.doFilter(request);
    }
}
