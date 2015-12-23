package io.hedwig.dp.creational.singleton;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public enum EnumSingleton {

    INSTANCE;
    @Override
    public String toString(){
        return getDeclaringClass().getCanonicalName();
    }
}
