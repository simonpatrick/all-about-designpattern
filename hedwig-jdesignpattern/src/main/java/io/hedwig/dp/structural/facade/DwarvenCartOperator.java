package io.hedwig.dp.structural.facade;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class DwarvenCartOperator extends DwarvenMineWorker {

    @Override
    public void work() {
        System.out.println(name() + " moves gold chunks out of the mine.");
    }

    @Override
    public String name() {
        return "Dwarf cart operator";
    }
}
