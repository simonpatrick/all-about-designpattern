package io.hedwig.jrefactoring.extractInterfaceMethod.extracted;

/**
 * Created by patrick on 15/10/28.
 */
public class ClassRegistration implements IClassRegistration {
    private double total;

    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public double total() {
        create();
        return total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
