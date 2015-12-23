package io.hedwig.dp.behavioral.chain;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class SingleRequestHandler extends RequestHandler  {

    public SingleRequestHandler(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if(req.getRequestType().equals(RequestType.SINGLE)){
            printHandling(req);
        }else{
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Single Request Handler";
    }
}
