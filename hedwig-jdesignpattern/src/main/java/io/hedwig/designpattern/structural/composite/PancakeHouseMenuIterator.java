package io.hedwig.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
    Iterator iterator;

    public PancakeHouseMenuIterator(ArrayList items) {
        iterator = items.iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }

    @Override
    public void remove() {

    }
}
