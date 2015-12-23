package io.hedwig.dp.structural.decorator;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class SmartTroll implements Hostile {
    private Hostile decorate;

    public SmartTroll(Hostile decorate) {
        this.decorate = decorate;
    }

    @Override
    public void attack() {
        System.out.println("decorated!!");
        decorate.attack();
    }

    @Override
    public void fleeBattle() {
        System.out.println("decorated!!!!");
        decorate.fleeBattle();
    }
}
