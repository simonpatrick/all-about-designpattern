package io.hedwig.jrefactoring.extractInterfaceMethod;

/**
 * Created by patrick on 15/10/28.
 */
public class ClassRegistration {
    private double total;

    public void create(){
        System.out.println("create");
    }

    public void transfer(){
        System.out.println("transfer");
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
