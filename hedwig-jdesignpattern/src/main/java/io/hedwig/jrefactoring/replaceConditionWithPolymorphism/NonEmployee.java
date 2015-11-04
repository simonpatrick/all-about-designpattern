package io.hedwig.jrefactoring.replaceConditionWithPolymorphism;

/**
 * Created by patrick on 15/11/4.
 */
public class NonEmployee extends Customer {
    @Override
    double tax() {
        return 0.10;
    }
}
