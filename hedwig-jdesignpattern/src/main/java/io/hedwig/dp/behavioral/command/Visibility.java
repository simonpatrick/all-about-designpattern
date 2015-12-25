package io.hedwig.dp.behavioral.command;

import com.google.common.base.MoreObjects;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public enum Visibility {

    VISIBLE("visible"),INVISIBLE("invisible");
    private String title;

    Visibility(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("title", title)
                .toString();
    }
}
