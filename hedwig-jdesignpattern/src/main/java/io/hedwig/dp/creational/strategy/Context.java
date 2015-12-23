package io.hedwig.dp.creational.strategy;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void beatIt(){
        strategy.beatIt();
    }
}
