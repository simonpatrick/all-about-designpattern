package io.hedwig.dp.creational.prototype;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public abstract class Prototype implements Cloneable{
    @Override
    protected abstract Object clone() throws CloneNotSupportedException;
}
