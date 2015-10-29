package io.hedwig.jrefactoring.extractInterfaceMethod.methods;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by patrick on 15/10/28.
 */
public class ReceiptExtracted {
    private List<Double> discounts= Lists.newArrayList();
    private List<Double> itemTotals= Lists.newArrayList();

    public double calculateGrandTotal(){
        double subTotal=calculateSubTotal();
        subTotal=calculateDiscounts(subTotal);
        subTotal=calculateTax(subTotal);
        return subTotal;
    }

    public double calculateTax(double subTotal){
        double tax=subTotal*0.065;
        subTotal+=tax;
        return subTotal;
    }

    public double calculateDiscounts(double subTotal){
        if(discounts.size()>0){
            for (Double discount : discounts) {
                subTotal-=discount;
            }
        }

        return subTotal;
    }

    public double calculateSubTotal(){
        double subTotal=0;
        for (Double itemTotal : itemTotals) {
            subTotal+=itemTotal;
        }

        return subTotal;
    }
}
