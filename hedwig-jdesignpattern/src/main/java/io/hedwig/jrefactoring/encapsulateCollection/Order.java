package io.hedwig.jrefactoring.encapsulateCollection;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.*;

/**
 * Created by patrick on 15/10/27.
 * Something it is not necessary to expose all the collection to client
 * only exposure add/remove/get items
 */
public class Order {

    private List<Item> itemList = Lists.newArrayList();

    public Order addItem(Item item){
        itemList.add(item);
        return this;
    }

    public Order removeItem(final Item item){
        itemList.remove(item);
        return this;
    }

    public Order removeItems(List<Item> items){
        itemList.removeAll(items);
        return this;
    }

    public int total(){
        return itemList.size();
    }

    public int distinctItemCount(){
        int result=0;
        List<String> itemNames=Lists.newArrayList();
        Set<String> names = Sets.newHashSet();
        itemList.stream().forEach(element ->
                names.add(element.getName()));
        return names.size();
    }


    public static class Item{
        private int itemId;
        private String name;
        private int quantity;
        private Double pricePerUnit;

        public static Item createItem(){
            Item item =new Item();
            item.setItemId(new Random().nextInt(100));
            item.setName("test" + new Random().nextInt(100));
            item.setQuantity(new Random().nextInt(100));
            item.setPricePerUnit(new Random().nextDouble());
            return item;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "itemId='" + itemId + '\'' +
                    ", name='" + name + '\'' +
                    ", quantity='" + quantity + '\'' +
                    ", pricePerUnit='" + pricePerUnit + '\'' +
                    '}';
        }

        public int getItemId() {
            return itemId;
        }

        public void setItemId(int itemId) {
            this.itemId = itemId;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public Double getPricePerUnit() {
            return pricePerUnit;
        }

        public void setPricePerUnit(Double pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
        }
    }
}
