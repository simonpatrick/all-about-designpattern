package io.hedwig.jrefactoring.breadMethod;

/**
 * Created by patrick on 15/11/4.
 */
public class Product {
    public double price;
    public double availableDiscounts;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAvailableDiscounts() {
        return availableDiscounts;
    }

    public void setAvailableDiscounts(double availableDiscounts) {
        this.availableDiscounts = availableDiscounts;
    }
}
