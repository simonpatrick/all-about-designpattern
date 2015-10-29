package io.hedwig.jrefactoring.extractFactoryClass;

/**
 * Created by patrick on 15/10/29.
 */
public class PolicyCarControllerRefactor {

    private PolicyCarFactory factory;

    public PolicyCarController.PolicyCar create(String serviceRequired
            ,String mileAge){
       return factory.create(serviceRequired,mileAge);
    }
}
