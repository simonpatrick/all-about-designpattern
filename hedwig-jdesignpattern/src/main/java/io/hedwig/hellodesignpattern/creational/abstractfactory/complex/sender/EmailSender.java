package io.hedwig.hellodesignpattern.creational.abstractfactory.complex.sender;

import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.Sender;

/**
 * Created by patrick on 15/12/27.
 */
public class EmailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send by Email");
    }
}
