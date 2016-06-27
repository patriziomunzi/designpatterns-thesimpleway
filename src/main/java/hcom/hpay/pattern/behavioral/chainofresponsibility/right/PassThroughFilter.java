package hcom.hpay.pattern.behavioral.chainofresponsibility.right;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class PassThroughFilter extends Filter {
    @Override
    public void doFilter(Request request) {
        System.out.println("PassThroughFilter");
        super.nextFilter(request);
    }
}
