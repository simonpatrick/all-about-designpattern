package io.hedwig.dp.structural.bridge;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class SuperMagicWizard extends MagicWizard{

    public SuperMagicWizard(SuperMagicWizardImpl impl) {
        super(impl);
    }

    @Override
    public void doIt() {
        getImp().doImpl();
    }

    @Override
    public void undo() {
        getImp().undoImp();
        getImp().superUndo();
    }

    @Override
    public void lastAction() {
        getImp().lastActionImp();
    }

    public SuperMagicWizardImpl getImp() {
        return (SuperMagicWizardImpl)impl;
    }
}
