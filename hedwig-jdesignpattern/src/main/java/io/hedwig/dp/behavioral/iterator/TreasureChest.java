package io.hedwig.dp.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patrick on 15/5/13.
 *
 * @version $Id$
 */


public class TreasureChest {

    private List<Item> items;

    public TreasureChest() {
        items = new ArrayList<>();
        items.add(new Item(ItemType.ANY, "ANY"));
        items.add(new Item(ItemType.OTHER, "OTHER"));
        items.add(new Item(ItemType.SINGLE, "SINGLE"));
    }

    ItemIterator Iterator(ItemType type) {
        return new TreasureChestItemIterator(this, type);
    }

    public List<Item> getItems() {
        ArrayList<Item> list = new ArrayList<>();
        list.addAll(items);
        return list;
    }
}
