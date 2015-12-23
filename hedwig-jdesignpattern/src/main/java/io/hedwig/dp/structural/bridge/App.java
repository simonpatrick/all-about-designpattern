package io.hedwig.dp.structural.bridge;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        SuperMagicWizard wizard= new SuperMagicWizard(new Magic());
        wizard.doIt();
        wizard.undo();
        wizard.lastAction();
    }
}
