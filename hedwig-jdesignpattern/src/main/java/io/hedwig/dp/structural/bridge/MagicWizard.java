package io.hedwig.dp.structural.bridge;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public  abstract class MagicWizard {
    protected MagicWizardImpl impl;

    public MagicWizard(MagicWizardImpl impl) {
        this.impl = impl;
    }

    public abstract void doIt();

    public abstract void undo();

    public abstract void lastAction();

    public MagicWizardImpl getImp() {
        return impl;
    }
}
