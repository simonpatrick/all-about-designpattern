package io.hedwig.dp.creational.abstractFactory.discreteproducts;

import com.google.common.base.MoreObjects;

/**
 * Created by patrick on 15/4/25.
 *
 * @version $Id$
 */


public class SelfCastle implements Castle{
    @Override
    public String toString() {
        return MoreObjects.toStringHelper("this is castle")
                .toString();
    }
}
