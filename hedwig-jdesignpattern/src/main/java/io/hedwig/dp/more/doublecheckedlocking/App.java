package io.hedwig.dp.more.doublecheckedlocking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class App {
    public static void main(String[] args) {
        final Inventory inventory = new Inventory(1000);
        ExecutorService executors = Executors.newFixedThreadPool(4);
        for (int i = 0; i <8 ; i++) {
            executors.execute(new Runnable() {
                @Override
                public void run() {
                    while (inventory.addItem(new Item()))
                        ;

                }
            });
        }

        System.out.println(inventory.size());
        executors.shutdownNow();
    }
}
