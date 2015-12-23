package io.hedwig.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public abstract class LetterComposite {
    private List<LetterComposite> children = new ArrayList<LetterComposite>();

    public void add(LetterComposite letter) {
        children.add(letter);
    }

    public int count() {
        return children.size();
    }

    protected abstract void printThisBefore();

    protected abstract void printThisAfter();

    public void print() {
        printThisBefore();
        for (LetterComposite letter : children) {
            letter.print();
        }
        printThisAfter();
    }
}
