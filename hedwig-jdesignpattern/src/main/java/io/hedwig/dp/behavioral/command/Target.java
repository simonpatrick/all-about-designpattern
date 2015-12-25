package io.hedwig.dp.behavioral.command;

import com.google.common.base.MoreObjects;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public abstract class Target {
    private Size size;
    private Visibility visibility;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public void printStatus(){
        System.out.println(String.format("%s, size=%s visibility=%s", this,
                getSize(), getVisibility()));
    }
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("size", size)
                .add("visibility", visibility)
                .toString();
    }
}
