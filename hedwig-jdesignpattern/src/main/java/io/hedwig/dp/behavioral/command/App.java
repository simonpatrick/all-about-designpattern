package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public class App {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        DefaultTarget target = new DefaultTarget();
        target.printStatus();
        wizard.castSpell(new ShrinkSpell(),target);
        target.printStatus();

        wizard.castSpell(new InvisibilitySpell(),target);
        target.printStatus();
        wizard.undoLastSpell();
        target.printStatus();
    }
}
