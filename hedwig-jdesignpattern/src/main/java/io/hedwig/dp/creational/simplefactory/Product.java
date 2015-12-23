package io.hedwig.dp.creational.simplefactory;

/**
 * Created by patrick on 15/4/10.
 *
 * @version $Id$
 */
public interface Product {
    default void sendSms(){
        System.out.println("sending default sms");
    }
}
