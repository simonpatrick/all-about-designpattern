package io.hedwig.dp.creational.strategy;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class RightHandStrategy implements Strategy {
    @Override
    public void beatIt() {
        System.out.println("beat it with right hand");
    }
}
