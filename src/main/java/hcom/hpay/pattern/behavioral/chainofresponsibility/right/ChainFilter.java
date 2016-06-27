package hcom.hpay.pattern.behavioral.chainofresponsibility.right;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ChainFilter extends Filter {
    @Override
    public void doFilter(Request request) {
        super.nextFilter(request);
    }
}
