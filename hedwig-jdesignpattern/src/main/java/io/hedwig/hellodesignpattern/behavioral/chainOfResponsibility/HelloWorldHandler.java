package io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility;

import io.hedwig.hellodesignpattern.HelloWorld;

/**
 * Created by patrick on 15/11/30.
 */
public abstract class HelloWorldHandler implements HelloWorld {

    private HelloWorldHandler next;

    public HelloWorldHandler setNext(HelloWorldHandler next) {
        this.next = next;
        return this;
    }

    public abstract void handle(StringBuffer stringBuffer);

    @Override
    public String helloWorld() {
        StringBuffer stringBuffer = new StringBuffer();
        handle(stringBuffer);
        if (next != null) {
            next.handle(stringBuffer);
        }
        return stringBuffer.toString();
    }
}
