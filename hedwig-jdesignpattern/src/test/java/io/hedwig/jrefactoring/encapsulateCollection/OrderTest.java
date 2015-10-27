package io.hedwig.jrefactoring.encapsulateCollection;

import com.google.common.collect.Lists;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by patrick on 15/10/27.
 */
public class OrderTest {
    private Order order = new Order();
    private Order.Item item = Order.Item.createItem();
    @org.junit.Test
    public void testAddItem() throws Exception {
        order.addItem(Order.Item.createItem());
        assertEquals(order.total(),1);
    }

    @org.junit.Test()
    public void testRemoveItem() throws Exception {
        order.addItem(item);
        int totalCount = order.total();
        order.removeItem(item);
        assertEquals(totalCount-order.total(),1);
    }

    @org.junit.Test
    public void testRemoveItems() throws Exception {
        List<Order.Item> items = Lists.newArrayList();
        items.add(item);
        items.add(Order.Item.createItem());

        order.addItem(item).addItem(Order.Item.createItem());
        order.removeItems(items);

        assertTrue(order.total()>0);
    }

}