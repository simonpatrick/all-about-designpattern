package io.hedwig.dp.structural.adapter;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        GnomeEngineerManager manager = new GnomeEngineerManager
                (new GnomeEngineer(new GoblinGlider()));
        manager.operateDevice();

    }
}
