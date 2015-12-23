package io.hedwig.dp.creational.prototype;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class FactoryImpl implements Factory {
    private Sam sam;
    private Beast beast;
    private Adams adams;

    public FactoryImpl(Sam sam, Beast beast, Adams adams) {
        this.sam = sam;
        this.beast = beast;
        this.adams = adams;
    }

    @Override
    public Sam createSame() {
        try {
            return sam.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Adams createAdams() {
        try {
            return adams.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
