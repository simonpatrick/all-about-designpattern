package io.hedwig.jrefactoring.breadMethod;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by patrick on 15/10/29.
 */
public class CashRegister {

    private double tax;
    private List<Product> products = Lists.newArrayList();

    public CashRegister() {
        tax=0.06;
    }

    //need to refactor this method
    public void acceptPayment(Customer customer,
                              List<Product> products,double payment){
        double subTotal = 0;
        for (Product product : products) {
            subTotal+=product.getPrice();
        }

        for (Product product : products) {
            subTotal-=product.getAvailableDiscounts();
        }

        double grandTotal=subTotal*tax;
        customer.deductFromAccountBalance(grandTotal);

    }

    //refactored
    private void substractFromCustomerBalance(Customer customer,double grandTotal){
        customer.deductFromAccountBalance(grandTotal);
    }

    private double addTax(double subTotal){
        return subTotal*tax;
    }

    private double subtractDiscounts(double subTotal){
        for (Product product : products) {
            subTotal-=product.getAvailableDiscounts();
        }
        return subTotal;
    }

    private double calculateSubTotal(){
        double subTotal =0;
        for (Product product : products) {
            subTotal+=product.getPrice();
        }
        return subTotal;
    }

    public void acceptPaymentRefactored(Customer customer
            ,double payment){
        double subTotal=calculateSubTotal();
        subTotal=subtractDiscounts(subTotal);
        double grandTotal = addTax(subTotal);
        substractFromCustomerBalance(customer,grandTotal);
    }

    //still think about, use functional style
}
