package io.hedwig.hellodesignpattern.creational.abstractfactory.complex;

import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.AbstractFactory;
import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.reciever.SmsReceiver;
import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.sender.SmsSender;

public class SmsFactory implements AbstractFactory {

    @Override
    public Sender createSender() {
        return new SmsSender();
    }

    @Override
    public Receiver createReceiver() {
        return new SmsReceiver();
    }

}
