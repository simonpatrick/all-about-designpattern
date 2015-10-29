package io.hedwig.jrefactoring.extractFactoryClass;

/**
 * Created by patrick on 15/10/29.
 */
public class PolicyCarFactory {

    public PolicyCarController.PolicyCar create(String serviceRequired
            ,String mileAge){
        return new PolicyCarController.PolicyCar(serviceRequired,mileAge);
    }
}
