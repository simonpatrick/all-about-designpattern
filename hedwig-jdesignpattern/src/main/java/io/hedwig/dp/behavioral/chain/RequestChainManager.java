package io.hedwig.dp.behavioral.chain;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class RequestChainManager {

    RequestHandler chain;

    public RequestChainManager() {
        buildChain();
    }

    private void buildChain(){
        chain= new CocurrenceRequestHandler(
                new MultipleRequestHandler(new SingleRequestHandler(null))
        );
    }

    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
}
