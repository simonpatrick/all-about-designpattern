package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class InvisibilitySpell extends Command {
    private Target target;

    @Override
    public void execute(Target target) {
        target.setVisibility(Visibility.INVISIBLE);
        this.target=target;
    }

    @Override
    public void undo() {
        if(target!=null){
            target.setVisibility(Visibility.VISIBLE);
        }
    }

    @Override
    public String toString() {
        return "Invisibility Spell";
    }
}
