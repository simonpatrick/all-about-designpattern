package io.hedwig.dp.creational.singleton;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class SimpleSingleton {
    private static SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
