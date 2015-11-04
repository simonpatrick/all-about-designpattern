package io.hedwig.jrefactoring.introduceDesignByContractChecks;

import io.hedwig.jrefactoring.breadMethod.Customer;
import io.hedwig.jrefactoring.breadMethod.Product;

import java.util.List;

/**
 * Created by patrick on 15/11/4.
 */
public class CashRegister {
    public double totalOrder(List<Product> products,Customer customer){
        double orderTotal = products.stream()
                .mapToDouble(Product::getPrice).sum();
        return orderTotal;
    }

    public double totalOrderRefactor(List<Product> products,Customer customer){
        if(customer==null) throw  new IllegalArgumentException("customer is null");
        if(products.size()==0) throw  new IllegalArgumentException("products is empty");
        double orderTotal = products.stream()
                .mapToDouble(Product::getPrice).sum();
        if(orderTotal==0) throw new RuntimeException("the order total is zero");
        return orderTotal;
    }
}
