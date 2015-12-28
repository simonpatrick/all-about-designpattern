package io.hedwig.hellodesignpattern.creational.abstractfactory.complex.reciever;

import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.Receiver;

/**
 * Created by patrick on 15/12/27.
 */
public class SmsReceiver implements Receiver {
    @Override
    public void receive() {
        System.out.println("received by SMS");
    }
}
