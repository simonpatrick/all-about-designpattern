package io.hedwig.dp.creational.singleton;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        System.out.println(SimpleSingleton.getInstance());
        System.out.println(ThreadSafeDoubleCheckLocking.getInstance());
        System.out.println(ThreadSafeLazyLoadedIvoryTower.getInstance());
        System.out.println(InitializingOnDemandHolderIdiom.getInstance());
    }
}
