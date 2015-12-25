package io.hedwig.dp.behavioral.command;

import com.google.common.base.MoreObjects;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Wizard extends Target {
    private Command previousSpell;

    public Wizard() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    public void castSpell(Command command,Target target){
        System.out.println(this + "casts ");
        command.execute(target);
        previousSpell = command;
    }

    public void undoLastSpell(){
        if(previousSpell!=null){
            System.out.println(this +" undoes "+previousSpell);
            previousSpell.undo();
        }
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("previousSpell", previousSpell)
                .add(":Wizards","Wizards")
                .toString();
    }
}
