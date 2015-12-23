package io.hedwig.dp.behavioral.chain;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        RequestChainManager manager = new RequestChainManager();
        manager.makeRequest(new Request("SingleRequest",RequestType.SINGLE));
        manager.makeRequest(new Request("MultipleRequest",RequestType.MULTIPLE));
        manager.makeRequest(new Request("ConcurrenceRequest",RequestType.CONCURRENCE));
    }
}
