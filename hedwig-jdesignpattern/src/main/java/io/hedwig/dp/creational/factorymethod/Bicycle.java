package io.hedwig.dp.creational.factorymethod;

/**
 * Created by patrick on 15/4/26.
 *
 * @version $Id$
 */


public class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle Moving!");
    }
}
