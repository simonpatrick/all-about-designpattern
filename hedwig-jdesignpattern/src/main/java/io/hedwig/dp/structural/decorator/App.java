package io.hedwig.dp.structural.decorator;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        System.out.println("A simple look ");
        Hostile troll = new Troll();
        troll.attack();
        troll.fleeBattle();

        System.out.println("decorated!!!!");
        Hostile smart= new SmartTroll(troll);
        smart.attack();
        smart.fleeBattle();
    }
}
