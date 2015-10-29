package io.hedwig.jrefactoring.switchToStrategy;

/**
 * Created by patrick on 15/10/28.
 */
public class AlaskShippingCalculation
        implements IShippingCalculation {
    @Override
    public double calculate() {
        return 10;
    }
}
