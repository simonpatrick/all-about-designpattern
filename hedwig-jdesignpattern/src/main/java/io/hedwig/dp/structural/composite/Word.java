package io.hedwig.dp.structural.composite;

import java.util.List;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Word extends LetterComposite{
    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printThisBefore() {
        System.out.print(" ");
    }

    @Override
    protected void printThisAfter() {
        // nop
    }
}
