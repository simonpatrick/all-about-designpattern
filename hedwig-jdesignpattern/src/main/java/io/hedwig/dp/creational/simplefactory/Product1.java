package io.hedwig.dp.creational.simplefactory;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */


public class Product1 implements Product {
    @Override
    public void sendSms() {
        System.out.println("sending product sms");
    }
}
