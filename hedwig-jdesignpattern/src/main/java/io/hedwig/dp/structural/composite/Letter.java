package io.hedwig.dp.structural.composite;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Letter  extends LetterComposite{
    private char c;

    public Letter(char c) {
        this.c = c;
    }

    @Override
    protected void printThisBefore() {
        System.out.print(c);
    }

    @Override
    protected void printThisAfter() {
        // nop
    }
}
