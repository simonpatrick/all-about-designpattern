package io.hedwig.dp.creational.factorymethod;

/**
 * Created by patrick on 15/4/26.
 *
 * @version $Id$
 */


public class GermanFactory extends FactoryMethod {
    public Vehicle createVehicle(String type){
        return new Porsche();
    }
}
