package io.hedwig.hellodesignpattern.behavioral.mediator;


import io.hedwig.hellodesignpattern.SplitHelloWorld;

public class HelloWorldMediator {

    private SplitHelloWorld.HelloWorldInterjection helloWorldInterjection;

    private SplitHelloWorld.HelloWorldObject helloWorldObject;

    public HelloWorldMediator(SplitHelloWorld.HelloWorldInterjection helloWorldInterjection, SplitHelloWorld.HelloWorldObject helloWorldObject) {
        this.helloWorldInterjection = helloWorldInterjection;
        this.helloWorldObject = helloWorldObject;
    }

    public String interjection() {
        return helloWorldInterjection.interjection();
    }

    public String object() {
        return helloWorldObject.object();
    }

}
