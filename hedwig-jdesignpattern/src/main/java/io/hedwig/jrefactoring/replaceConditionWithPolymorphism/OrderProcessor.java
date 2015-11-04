package io.hedwig.jrefactoring.replaceConditionWithPolymorphism;

import io.hedwig.jrefactoring.breadMethod.Product;

import java.util.List;

/**
 * Created by patrick on 15/11/4.
 */
public class OrderProcessor {
    public double processOrder(Customer cu,List<Product> products){
        double orderTotal = products.parallelStream().mapToDouble(Product::getPrice).sum();
        if(cu instanceof Employee){
            orderTotal-=orderTotal*0.15;
        }

        if (cu instanceof NonEmployee){
            orderTotal-=orderTotal*0.10;
        }

        return orderTotal;
    }

    public double processOrderRefactor(Customer cu,List<Product> products){
        double orderTotal = products.parallelStream().mapToDouble(Product::getPrice).sum();

        orderTotal-=orderTotal*cu.tax();
        return orderTotal;
    }
}
