package io.hedwig.dp.structural.decorator;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Troll implements Hostile {
    @Override
    public void attack() {
        System.out.println("default attack method");
    }

    @Override
    public void fleeBattle() {
        System.out.println("default flee battle");
    }
}
