package io.hedwig.jrefactoring.switchToStrategy;

/**
 * Created by patrick on 15/10/28.
 */
public class ClientCode {
    public static void main(String[] args) {
        ShippingInfo info= new ShippingInfo();
        info.calculateShippingAmount(State.Alaska);
    }
}
