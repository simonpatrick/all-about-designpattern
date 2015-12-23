package io.hedwig.dp.behavioral.templatemethod;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        HalflingThief thief = new HalflingThief(new HitAndRunMethod());
        thief.steal();
        thief.changeMethod(new SubtleMethod());
        thief.steal();
    }
}
