package io.hedwig.dp.structural.adapter;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class GnomeEngineer implements Engineer {
    private GoblinGlider glider;

    public GnomeEngineer(GoblinGlider glider) {
        this.glider = glider;
    }


    @Override
    public void operateDevice() {
        glider.attachGlider();
        glider.gainSpeed();
        glider.takeOff();
    }
}
