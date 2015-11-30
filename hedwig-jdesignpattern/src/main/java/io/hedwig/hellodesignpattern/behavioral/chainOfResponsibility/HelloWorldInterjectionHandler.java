package io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility;

public class HelloWorldInterjectionHandler extends HelloWorldHandler {
    @Override
    public void handle(StringBuffer stringBuffer) {
        stringBuffer.append("Hello ");
    }
}