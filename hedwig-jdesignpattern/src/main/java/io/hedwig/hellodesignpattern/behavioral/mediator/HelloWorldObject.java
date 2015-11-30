package io.hedwig.hellodesignpattern.behavioral.mediator;


import io.hedwig.hellodesignpattern.HelloWorld;
import io.hedwig.hellodesignpattern.SplitHelloWorld;

public class HelloWorldObject implements SplitHelloWorld.HelloWorldObject, HelloWorld {

    private HelloWorldMediator helloWorldMediator;

    private static final String separator = " ";

    private static final String terminator = "!";

    public void setHelloWorldMediator(HelloWorldMediator helloWorldMediator) {
        this.helloWorldMediator = helloWorldMediator;
    }

    @Override
    public String object() {
        return "Mediator";
    }

    @Override
    public String helloWorld() {
        return helloWorldMediator.interjection() + separator + object() + terminator;
    }
}
