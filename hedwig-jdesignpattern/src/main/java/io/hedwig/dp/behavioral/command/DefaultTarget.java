package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class DefaultTarget extends Target{


    public DefaultTarget() {
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString(){
        return "Default Target";
    }
}
