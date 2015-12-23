package io.hedwig.dp.creational.strategy;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class Client {

    public static void main(String[] args) {
        Context c = new Context(new AllhandsStrategy());
        c.beatIt();
        Context d = new Context(new RightHandStrategy());
        d.beatIt();
    }
}
