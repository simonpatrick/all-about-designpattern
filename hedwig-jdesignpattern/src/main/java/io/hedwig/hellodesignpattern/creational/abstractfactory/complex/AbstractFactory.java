package io.hedwig.hellodesignpattern.creational.abstractfactory.complex;

/**
 * Created by patrick on 15/12/27.
 */
public interface AbstractFactory {
    public Sender createSender();
    public Receiver createReceiver();
}
