package io.hedwig.dp.structural.bridge;

public class Magic extends SuperMagicWizardImpl  {


    @Override
    public void superUndo() {
        System.out.println("super undo");
    }

    @Override
    public void doImpl() {
        System.out.println("do imple");
    }

    @Override
    public void undoImp() {
        System.out.println("undo impl");
    }

    @Override
    public void lastActionImp() {
        System.out.println("last Action Impl");
    }
}