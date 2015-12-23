package io.hedwig.dp.creational.factorymethod;

/**
 * Created by patrick on 15/4/26.
 *
 * @version $Id$
 */


public class ItalianFactory extends FactoryMethod {

    public Vehicle createVehicle(String type){

        if(type.equalsIgnoreCase("Ferrari")){
            return new Ferrari();
        }else{
            throw new RuntimeException("can't produce this "+type+" vehicle");
        }
    }
}
