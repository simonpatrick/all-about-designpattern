package io.hedwig.hellodesignpattern.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class HelloWorldCharacterIterator implements Iterator<Character> {

    private char[] characters;

    private int size;

    private int index;

    public HelloWorldCharacterIterator(char[] characters) {
        this.characters = characters;
        this.size = characters.length;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public Character next() {
        return characters[index++];
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove not support!");
    }
}
