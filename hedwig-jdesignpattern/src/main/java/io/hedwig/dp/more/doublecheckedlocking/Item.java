package io.hedwig.dp.more.doublecheckedlocking;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Item {

    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
