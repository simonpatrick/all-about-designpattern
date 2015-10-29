package io.hedwig.jrefactoring.extractInterfaceMethod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by patrick on 15/10/28.
 */
public class Receipt {

    private List<Double> discounts= Lists.newArrayList();
    private List<Double> itemTotals=Lists.newArrayList();

    public double calculateGradTotal(){
        double subTotal =0;
        for (Double itemTotal : itemTotals) {
            subTotal+=itemTotal;
        }

        if(discounts.size()>0){
            for (Double discount : discounts) {
                subTotal-=discount;
            }
        }

        double tax=subTotal*0.065;
        subTotal+=tax;
        return subTotal;
    }

    public List<Double> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Double> discounts) {
        this.discounts = discounts;
    }

    public List<Double> getItemTotals() {
        return itemTotals;
    }

    public void setItemTotals(List<Double> itemTotals) {
        this.itemTotals = itemTotals;
    }
}
