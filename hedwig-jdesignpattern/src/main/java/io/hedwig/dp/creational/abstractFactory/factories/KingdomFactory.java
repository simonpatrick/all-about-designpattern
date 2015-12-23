package io.hedwig.dp.creational.abstractFactory.factories;

import com.hedwig.dp.creational.abstractFactory.discreteproducts.Army;
import com.hedwig.dp.creational.abstractFactory.discreteproducts.Castle;
import com.hedwig.dp.creational.abstractFactory.discreteproducts.SelfArmy;
import com.hedwig.dp.creational.abstractFactory.discreteproducts.SelfCastle;

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
