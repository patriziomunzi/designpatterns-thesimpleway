package hcom.hpay.pattern.behavioral.chainofresponsibility.wrong;

import hcom.hpay.pattern.behavioral.chainofresponsibility.Request;

/**
 * TODO: Document.
 * @author pmunzi
 */
public abstract class Filter {
    private Filter next;

    public void add(final Filter filter) {
        if (next == null) {
            this.next = filter;
        } else {
            next.add(filter);
        }
    }

    protected final void nextFilter(final Request request) {
        if (next != null) {
            next.doFilter(request);
        }
    }

    public abstract boolean doFilter(final Request request);
}
