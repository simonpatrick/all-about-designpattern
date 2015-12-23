package io.hedwig.dp.structural.adapter;

/**
 * Created by patrick on 15/5/12.
 * Adapter class. Adapts the interface of the device
 * @version $Id$
 */


public class GnomeEngineerManager implements Engineer {
    private Engineer engineer;

    public GnomeEngineerManager(Engineer engineer) {
        this.engineer = engineer;
    }

    @Override
    public void operateDevice() {
        engineer.operateDevice();
    }
}
