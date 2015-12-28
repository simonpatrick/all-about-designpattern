package io.hedwig.dp.creational.abstractFactory.factories;

import io.hedwig.dp.creational.abstractFactory.discreteproducts.Army;
import io.hedwig.dp.creational.abstractFactory.discreteproducts.Castle;
import io.hedwig.dp.creational.abstractFactory.discreteproducts.SelfArmy;
import io.hedwig.dp.creational.abstractFactory.discreteproducts.SelfCastle;

/**
 * Created by patrick on 15/4/25.
 *
 * @version $Id$
 */
public interface KingdomFactory {
    default Castle createCastle(){
        return new SelfCastle();
    }

    default Army createArmy(){
        return new SelfArmy();
    }
}
