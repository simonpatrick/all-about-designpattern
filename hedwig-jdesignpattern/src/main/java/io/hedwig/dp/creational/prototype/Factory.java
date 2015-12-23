package io.hedwig.dp.creational.prototype;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public interface Factory {
    Sam createSame();
    Adams createAdams();
    Beast createBeast();
}
