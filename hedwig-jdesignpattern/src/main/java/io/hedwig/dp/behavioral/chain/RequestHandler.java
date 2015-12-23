package io.hedwig.dp.behavioral.chain;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + " handling request \"" + req + "\"");
    }

    @Override
    public abstract String toString();
}
