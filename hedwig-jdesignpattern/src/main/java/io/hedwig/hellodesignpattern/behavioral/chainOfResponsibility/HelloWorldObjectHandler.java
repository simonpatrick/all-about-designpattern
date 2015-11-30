package io.hedwig.hellodesignpattern.behavioral.chainOfResponsibility;

public class HelloWorldObjectHandler extends HelloWorldHandler {
    @Override
    public void handle(StringBuffer stringBuffer) {
        stringBuffer.append("Chain of Responsibility!");
    }
}