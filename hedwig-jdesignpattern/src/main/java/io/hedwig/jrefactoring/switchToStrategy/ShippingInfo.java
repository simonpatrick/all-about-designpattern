package io.hedwig.jrefactoring.switchToStrategy;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by patrick on 15/10/28.
 */
public class ShippingInfo {
    private Map<State,IShippingCalculation> calculationMap=
            Maps.newConcurrentMap();

    public ShippingInfo() {
        calculationMap.put(State.Alaska,new AlaskShippingCalculation());
        calculationMap.put(State.NewYork,new NewYorkShippingCalculation());
        calculationMap.put(State.Florida,new FloridaShippingCalculation());
    }


    public double calculateShippingAmount(State state){
        return calculationMap.get(state).calculate();
    }
}
