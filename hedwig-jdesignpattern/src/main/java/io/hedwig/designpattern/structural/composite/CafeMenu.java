package io.hedwig.designpattern.structural.composite;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu extends MenuComponent {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger", "Veggie Burger and fries", true, 3.99);
        addItem("Soup of the day", "A cup of soup and side salad", false, 3.69);
        addItem("Large Burrito", "A large burrito with beans, salsa, and guacamole", true, 4.29);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }


}
