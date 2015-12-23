package io.hedwig.dp.structural.facade;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}
