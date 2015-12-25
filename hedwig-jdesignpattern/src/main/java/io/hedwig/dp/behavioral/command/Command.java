package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/12.
 *
 * @version $Id$
 */


public abstract class Command {
    public abstract void execute(Target target);
    public abstract void undo();
    @Override
    public abstract String toString();
}
