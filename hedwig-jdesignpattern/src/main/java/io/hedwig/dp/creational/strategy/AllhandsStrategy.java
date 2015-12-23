package io.hedwig.dp.creational.strategy;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class AllhandsStrategy implements Strategy {
    @Override
    public void beatIt() {
        System.out.println("beat it with all hands strategy");
    }
}
