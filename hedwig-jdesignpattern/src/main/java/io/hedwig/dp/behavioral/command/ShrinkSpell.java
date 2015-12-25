package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class ShrinkSpell extends Command {
    private Size oldSize;
    private Target target;

    @Override
    public void execute(Target target) {
        oldSize=target.getSize();
        target.setSize(Size.SMALL);
        this.target=target;
    }

    @Override
    public void undo() {
        if(oldSize!=null&&target!=null){
            target.setSize(oldSize);
        }
    }

    @Override
    public String toString() {
        return "ShrinkSpell";
    }
}
