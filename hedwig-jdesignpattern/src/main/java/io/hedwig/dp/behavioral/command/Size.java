package io.hedwig.dp.behavioral.command;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public enum Size {
    SMALL("small"), NORMAL("normal"), LARGE("large");
    private String title;

    Size(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}

