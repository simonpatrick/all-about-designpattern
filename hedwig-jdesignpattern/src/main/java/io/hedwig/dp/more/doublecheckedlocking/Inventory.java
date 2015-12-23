package io.hedwig.dp.more.doublecheckedlocking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class Inventory {
    private int inventorySize;
    private List<Item> items;
    private Lock lock = new ReentrantLock();


    public Inventory(int inventorySize) {
        this.inventorySize = inventorySize;
        this.items=new ArrayList<>(inventorySize);
    }

    public boolean addItem(Item item){ //抢购
        if (items.size() < inventorySize) {//enable add item
            lock.lock();//lock
            try {
                if (items.size() < inventorySize) {//double checked locking
                    items.add(item);
                    System.out.println(Thread.currentThread());
                    return true;
                }
            } finally {
                lock.unlock();
            }
        }
        return false;
    }

    public int size() {
        return items.size();
    }
}
