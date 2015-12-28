package io.hedwig.dp.creational.abstractFactory.factories;

import io.hedwig.dp.creational.abstractFactory.discreteproducts.Army;
import io.hedwig.dp.creational.abstractFactory.discreteproducts.Castle;

/**
 * Created by patrick on 15/4/25.
 *
 * @version $Id$
 */


public class EmployedKingdomFactory implements KingdomFactory {
    @Override
    public Castle createCastle() {
        return new Castle() {
            @Override
            public String toString() {
                return "this is people Castle";
            }
        };
    }

    @Override
    public Army createArmy() {
        return new Army() {
            @Override
            public String toString() {
                return "this is employed army";
            }
        };
    }
}
