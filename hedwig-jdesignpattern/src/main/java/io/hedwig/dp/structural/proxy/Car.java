package io.hedwig.dp.structural.proxy;

/**
 * Created by patrick on 15/4/6.
 *
 * @version $Id$
 */


public class Car implements Movable {
    @Override
    public void move() {
        System.out.println("car is moving");
    }
}
