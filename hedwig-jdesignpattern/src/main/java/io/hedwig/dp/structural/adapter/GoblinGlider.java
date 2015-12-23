package io.hedwig.dp.structural.adapter;

/**
 * Created by patrick on 15/5/12.
 * Device Class(adaptee in the pattern)
 * @version $Id$
 */


public class GoblinGlider {
    public void attachGlider(){
        System.out.println("Glider attached");
    }

    public void gainSpeed(){
        System.out.println("Gaining speed");
    }

    public void takeOff (){
        System.out.println("Lift-off!");
    }
}
