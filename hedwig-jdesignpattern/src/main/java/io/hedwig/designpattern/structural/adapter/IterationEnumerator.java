package io.hedwig.designpattern.structural.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IterationEnumerator implements Enumeration {

    Iterator iterator;

    public IterationEnumerator(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}