package io.hedwig.hellodesignpattern.creational.abstractfactory.complex;

import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.reciever.EmailReceiver;
import io.hedwig.hellodesignpattern.creational.abstractfactory.complex.sender.EmailSender;

public class EmailFactory implements AbstractFactory {

    @Override
    public Sender createSender() {
        return new EmailSender();
    }

    @Override
    public Receiver createReceiver() {
        return new EmailReceiver();
    }

}