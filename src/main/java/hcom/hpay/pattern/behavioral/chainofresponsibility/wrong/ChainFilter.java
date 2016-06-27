package hcom.hpay.pattern.behavioral.chainofresponsibility.wrong;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class ChainFilter extends Filter {
    @Override
    public boolean doFilter(Request request) {
        super.nextFilter(request);
        return false;
    }
}
