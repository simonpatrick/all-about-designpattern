package io.hedwig.jrefactoring.breakDepenency.refactored;

import io.hedwig.jrefactoring.breakDepenency.Feeder;

/**
 * Created by patrick on 15/10/29.
 */
public class FeederService implements IFeederService{
    @Override
    public void replenishFood() {
        Feeder.replenishFood();
    }
}
