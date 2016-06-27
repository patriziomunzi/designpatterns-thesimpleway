package hcom.hpay.pattern.behavioral.chainofresponsibility.wrong;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public class BlockingFilter extends Filter {
    @Override
    public boolean doFilter(Request request) {
        System.out.println("BlockingFilter");
        return true;
    }
}
