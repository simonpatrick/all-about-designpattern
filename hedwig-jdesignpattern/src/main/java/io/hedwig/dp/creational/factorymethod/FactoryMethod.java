package io.hedwig.dp.creational.factorymethod;

/**
 * Created by patrick on 15/4/26.
 *The good point over the SimpleFactory is you can subclass
 * it to implement different ways to create objects

 For simple case, this abstract class could be just an interface

 This pattern is a "real" Design Pattern because it achieves
 the "Dependency Inversion Principle" a.k.a
 the "D" in S.O.L.I.D principles.

 It means the FactoryMethod class depends on abstractions, not concrete classes. This is the real trick compared to SimpleFactory or StaticFactory.
 * @version $Id$
 */


public abstract class FactoryMethod {
    public abstract Vehicle createVehicle(String type);

    public Vehicle create(String type){
        return createVehicle(type);
    }
}
