package io.hedwig.dp.creational.strategy;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */
public interface Strategy {
    default void beatIt(){
        System.out.println("beat it with left hand");
    }
}
