package io.hedwig.dp.behavioral.chain;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class CocurrenceRequestHandler extends RequestHandler {
    public CocurrenceRequestHandler(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(RequestType.CONCURRENCE)){
            printHandling(req);
        }else{
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Concurrence Requests Handler";
    }
}
