package io.hedwig.dp.creational.prototype;

public abstract class Sam extends Prototype {

	@Override
    public abstract Sam clone() throws CloneNotSupportedException;

}