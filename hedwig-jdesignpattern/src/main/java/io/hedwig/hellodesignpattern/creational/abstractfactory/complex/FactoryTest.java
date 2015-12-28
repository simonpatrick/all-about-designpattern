package io.hedwig.hellodesignpattern.creational.abstractfactory.complex;


public class FactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new EmailFactory();
        Sender mailSender = factory.createSender();
        mailSender.send();
        Receiver mailReceiver = factory.createReceiver();
        mailReceiver.receive();
    }
}