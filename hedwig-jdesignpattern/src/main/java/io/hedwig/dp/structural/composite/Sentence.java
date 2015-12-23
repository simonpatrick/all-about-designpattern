package io.hedwig.dp.structural.composite;

import java.util.List;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Sentence extends LetterComposite {
    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printThisBefore() {
        // nop
    }

    @Override
    protected void printThisAfter() {
        System.out.print(".");
    }
}
